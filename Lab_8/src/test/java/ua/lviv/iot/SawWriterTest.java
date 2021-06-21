package ua.lviv.iot;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import ua.lviv.iot.saws.models.*;
import ua.lviv.iot.saws.writers.SawWriter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SawWriterTest {

    @Test
    public void testConvertToCSVAllTypesOfSaws() {
        AtomicInteger sawId = new AtomicInteger(1);
        ArrayList<Saw> saws = new ArrayList<>();
        saws.add(new Jigsaw(sawId.getAndIncrement(), new SawMaterial("plastic", "copper"), 0, 14.5, 240));
        saws.add(new Chainsaw(sawId.getAndIncrement(), new SawMaterial("plastic", "steel"), 1, 30.0, 5.5));
        saws.add(new RippingSaw(sawId.getAndIncrement(), new SawMaterial("wood", "lead"), 2, 16.0, 5.0, "round"));
        saws.add(new Hacksaw(sawId.getAndIncrement(), new SawMaterial("plastic", "steel"), 3, 12.0, 10.0, "Blades CO"));
        saws.add(new TwoManSaw(sawId.getAndIncrement(), new SawMaterial("wood", "steel"), 0, 40.5, 6.0, 5));
        saws.add(new Hacksaw(sawId.getAndIncrement(), new SawMaterial("wood", "steel"), 5, 13.5, 8.25, "Blades CO"));
        saws.add(new RippingSaw(sawId.getAndIncrement(), new SawMaterial("plastic", "lead"), 2, 9.0, 5.0, "rectangle"));
        saws.add(new Jigsaw(sawId.getAndIncrement(), new SawMaterial("plastic", "steel"), 1, 12.5, 240));
        saws.add(new Chainsaw(sawId.getAndIncrement(), new SawMaterial("plastic", "steel"), 2, 35.5, 3.5));
        saws.add(new Fretsaw(
                sawId.getAndIncrement(), new SawMaterial("wood", "aluminium"), 4, 13.2, 7.0, 20.5, "Blades CO"
        ));
        SawWriter.writeToFile("target/SAWS.csv", saws);
        File result = new File("target/SAWS.csv");
        File expected = new File("src/test/resources/ALL-SAWS-SAMPLE.csv");
        try {
            assertEquals(true, FileUtils.contentEquals(result, expected));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testConvertToCSVOneTypeOfSaws() {
        AtomicInteger sawId = new AtomicInteger(1);
        ArrayList<Saw> saws = new ArrayList<>();
        saws.add(new Jigsaw(sawId.getAndIncrement(), new SawMaterial("plastic", "copper"), 0, 14.5, 240));
        saws.add(new Jigsaw(sawId.getAndIncrement(), new SawMaterial("plastic", "steel"), 1, 12.5, 240));
        saws.add(new Jigsaw(sawId.getAndIncrement(), new SawMaterial("plastic", "aluminium"), 2, 10.5, 240));
        SawWriter.writeToFile("target/SAWS.csv", saws);
        File result = new File("target/SAWS.csv");
        File expected = new File("src/test/resources/ONE-TYPE-SAWS-SAMPLE.csv");
        try {
            assertEquals(true, FileUtils.contentEquals(result, expected));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testConvertToCSVNoSaws() {
        File expected = new File("target/SAWS.csv");
        ArrayList<Saw> saws = new ArrayList<>();
        SawWriter.writeToFile("target/SAWS.csv", saws);
        File result = new File("target/SAWS.csv");
        try {
            assertEquals(true, FileUtils.contentEquals(result, expected));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
