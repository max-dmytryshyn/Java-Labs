package ua.lviv.iot.saws.writers;

import ua.lviv.iot.saws.models.Person;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class PersonWriter {
    public static void writeToFile(String filePath, List<Person> people) {
        if (!people.isEmpty()) {
            try {
                File csvOutputFile = new File(filePath);
                System.out.println("Creating a " + filePath);
                if (csvOutputFile.createNewFile()) {
                    System.out.println("File " + filePath + " created");
                } else {
                    System.out.println("File " + filePath + " already exists");
                }
            } catch (IOException e) {
                System.out.println("Error occurred. Cannot create a file in " + filePath);
                e.printStackTrace();
            }
            try {
                FileWriter csvOutputFileWriter = new FileWriter(filePath);
                System.out.println("Writing to " + filePath);
                csvOutputFileWriter.write(people.get(0).getHeaders() + "\n");
                people.forEach(person -> {
                    try {
                        csvOutputFileWriter.write(person.toCSV() + '\n');
                    } catch (IOException e) {
                        System.out.println("Error occurred. Cannot write to " + filePath);
                        e.printStackTrace();
                    }
                });
                csvOutputFileWriter.close();
                System.out.println("Successfully wrote to " + filePath);
            } catch (IOException e) {
                System.out.println("Error occurred. Cannot create file writer for " + filePath);
                e.printStackTrace();
            }
        }
        else {
            System.out.println("No people to write");
        }
    }
}
