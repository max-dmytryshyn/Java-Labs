package ua.lviv.iot.saws.writers;

import ua.lviv.iot.saws.models.Saw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class SawWriter {
    public static void writeToFile(final String filePath, final List<Saw> saws) {
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
        if (!saws.isEmpty()) {
            try {
                FileWriter csvOutputFileWriter = new FileWriter(filePath);
                System.out.println("Writing to " + filePath);
                saws.sort(Comparator.comparing(saw -> saw.getClass().getSimpleName()));
                String currentHeader = saws.get(0).getHeaders();
                csvOutputFileWriter.write(currentHeader + "\n");
                for (Saw saw: saws) {
                    try {
                        if (!saw.getHeaders().equals(currentHeader)) {
                            csvOutputFileWriter.write(currentHeader + "\n");
                            currentHeader = saw.getHeaders();
                        }
                        csvOutputFileWriter.write(saw.toCSV() + '\n');
                    } catch (IOException e) {
                        System.out.println("Error occurred. Cannot write to " + filePath);
                        e.printStackTrace();
                    }
                }
                csvOutputFileWriter.close();
                System.out.println("Successfully wrote to " + filePath);
            } catch (IOException e) {
                System.out.println("Error occurred. Cannot create file writer for " + filePath);
                e.printStackTrace();
            }
        } else {
            System.out.println("No saws to write");
        }
    }
}

