package ua.lviv.iot;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.saws.models.Person;
import ua.lviv.iot.saws.models.Saw;
import ua.lviv.iot.saws.writers.PersonWriter;
import ua.lviv.iot.saws.writers.SawWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonWriterTest {

    @Test
    void test_convert_to_csv_people_provided(){
        AtomicInteger personId = new AtomicInteger(0);
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(personId.getAndIncrement(), "Max", 17));
        people.add(new Person(personId.getAndIncrement(), "Danylo", 19));
        people.add(new Person(personId.getAndIncrement(), "La Kosta", 18));
        people.add(new Person(personId.getAndIncrement(), "Dmytro", 13));
        people.add(new Person(personId.getAndIncrement(), "Ivan", 18));
        people.add(new Person(personId.getAndIncrement(), "Andrew", 18));
        PersonWriter.writeToFile("src/test/resources/USERS.csv", people);
        File result = new File("src/test/resources/USERS.csv");
        File expected = new File("src/test/resources/USERS-SAMPLE.csv");
        try {
            assertEquals(true, FileUtils.contentEquals(expected, result));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void test_convert_to_csv_no_people_provided(){
        File expected = new File("src/test/resources/USERS.csv");
        ArrayList<Saw> saws = new ArrayList<>();
        SawWriter.writeToFile("src/test/resources/USERS.csv", saws);
        File result = new File("src/test/resources/USERS.csv");
        try {
            assertEquals(true, FileUtils.contentEquals(result, expected));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}