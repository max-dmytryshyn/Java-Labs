import ua.lviv.iot.saws.manager.SawManager;
import ua.lviv.iot.saws.manager.SortOrder;
import ua.lviv.iot.saws.models.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        AtomicInteger personId = new AtomicInteger(0);
        AtomicInteger sawId = new AtomicInteger(0);
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Saw> saws = new ArrayList<>();
        people.add(new Person(personId.getAndIncrement(), "Max", 17));
        people.add(new Person(personId.getAndIncrement(), "Danylo", 19));
        people.add(new Person(personId.getAndIncrement(), "La Kosta", 18));
        people.add(new Person(personId.getAndIncrement(), "Dmytro", 13));
        people.add(new Person(personId.getAndIncrement(), "Ivan", 18));
        people.add(new Person(personId.getAndIncrement(), "Andrew", 18));
        Jigsaw jigsaw = new Jigsaw(
                sawId.getAndIncrement(), new SawMaterial("copper", "plastic"), people.get(0).getId(), 14.5, 240
        );
        Chainsaw chainsaw = new Chainsaw(
                sawId.getAndIncrement(), new SawMaterial("steel", "plastic"), people.get(1).getId(), 30.0, 5.5
        );
        RippingSaw rippingSaw = new RippingSaw(
                sawId.getAndIncrement(), new SawMaterial("lead", "wood"), people.get(2).getId(), 16.0, 5.0, "round"
        );
        Hacksaw hacksaw = new Hacksaw(
                sawId.getAndIncrement(), new SawMaterial("steel", "plastic"), people.get(3).getId(), 12.0, 10.0, "Blades CO"
        );
        Fretsaw fretsaw = new Fretsaw(
                sawId.getAndIncrement(), new SawMaterial("aluminium", "wood"), people.get(4).getId(), 13.2, 7.0, 20.5, "Blades CO"
        );
        TwoManSaw twoManSaw = new TwoManSaw(
                sawId.getAndIncrement(), new SawMaterial("steel", "wood"), people.get(0).getId(), 40.5, 6.0, people.get(5).getId()
        );
        SawManager sawManager = new SawManager();
        sawManager.addSaws(Arrays.asList(jigsaw, chainsaw, rippingSaw, hacksaw, fretsaw, twoManSaw, jigsaw, chainsaw, rippingSaw, hacksaw, fretsaw, twoManSaw));
        System.out.println("All saws:");
        sawManager.getAllSaws().forEach(System.out::println);
        System.out.println("--------------------------------------");
        System.out.println("Saws with mechanical drive:");
        sawManager.searchByDriveType(DriveType.MECHANICAL).forEach(System.out::println);
        System.out.println("Saws with electric drive:");
        sawManager.searchByDriveType(DriveType.ELECTRIC).forEach(System.out::println);
        System.out.println("Saws with internal combustion engine:");
        sawManager.searchByDriveType(DriveType.INTERNAL_COMBUSTION_ENGINE).forEach(System.out::println);
        System.out.println("--------------------------------------");
        System.out.println("Saws with steel blade and plastic handle:");
        sawManager.searchBySawMaterial(new SawMaterial("steel", "plastic")).forEach(System.out::println);
        System.out.println("--------------------------------------");
        System.out.println("Saws sorted by length in ascending order:");
        sawManager.sortByLength(SortOrder.ASC);
        sawManager.getAllSaws().forEach(System.out::println);
        System.out.println("Saws sorted by length in descending order:");
        sawManager.sortByLength(SortOrder.DESC);
        sawManager.getAllSaws().forEach(System.out::println);
        System.out.println("--------------------------------------");
        System.out.println("END");
    }
}
