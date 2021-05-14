import ua.lviv.iot.saws.manager.SawManager;
import ua.lviv.iot.saws.manager.SortOrder;
import ua.lviv.iot.saws.models.*;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Jigsaw jigsaw = new Jigsaw(
                new SawMaterial("copper", "plastic"), new Person("Max", 17), 14.5, 240
        );
        Chainsaw chainsaw = new Chainsaw(
                new SawMaterial("steel", "plastic"), new Person("Danylo", 19), 30.0, 5.5
        );
        RippingSaw rippingSaw = new RippingSaw(
                new SawMaterial("lead", "wood"), new Person("La Kosta", 18), 16.0, 5.0, "round"
        );
        Hacksaw hacksaw = new Hacksaw(
                new SawMaterial("steel", "plastic"), new Person("Dmytro", 13), 12.0, 10.0, "Blades CO"
        );
        Fretsaw fretsaw = new Fretsaw(
                new SawMaterial("aluminium", "wood"), new Person("Ivan", 18), 13.2, 7.0, 20.5, "Blades CO"
        );
        TwoManSaw twoManSaw = new TwoManSaw(
                new SawMaterial("steel", "wood"), new Person("Max", 17), 40.5, 6.0, new Person("Andrew", 18)
        );
        SawManager sawManager = new SawManager();
        sawManager.addSaws(Arrays.asList(jigsaw, chainsaw, rippingSaw, hacksaw, fretsaw, twoManSaw));
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
