package ua.lviv.iot.algo.part1.lab3.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.algo.part1.lab3.*;

public class InsectWriterTest {
    private static final String RESULT_FILE = "result.csv";
    private static final String EXPECTED_FILE = "expected.csv";

    private InsectWriter writer;
    private List<Insect> insects;

    @BeforeEach
    public void setUp() throws IOException {
        writer = new InsectWriter();
        insects = new ArrayList<>();

        insects.add(new Hornet("Hornet1", 6, true, true, "Vespa crabro"));
        insects.add(new Ant("Ant1", 6, false, true, "Fire ant"));
        insects.add(new Hornet("Hornet2", 6, true, true, "Vespa ducalis"));
        insects.add(new Mosquito("Mosquito1", 6, true, true, true));
        insects.add(new Mosquito("Mosquito2", 6, true, false, false));
        insects.add(new Butterfly("Butterfly", 4, true, false, "Red"));
        insects.add(new Ant("Ant2", 6, false, true, "Bullet ant"));

        Files.deleteIfExists(Path.of(RESULT_FILE));
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILE));
    }

    @Test
    public void fileExistTest() {
        writer.writeToFile(new ArrayList<>());
        File file = new File(RESULT_FILE);

        assertFalse(file.exists());
    }

    @Test 
    public void writeInsectsTest() throws IOException {
        writer.writeToFile(insects);
        Path resultFile = Path.of(RESULT_FILE);
        Path expectedFile = Path.of(EXPECTED_FILE);

        assertEquals(-1L, Files.mismatch(resultFile, expectedFile));
    }

    @Test
    public void overrideFileTest() throws IOException {
        try (FileWriter fileWriter = new FileWriter(RESULT_FILE)) {
            fileWriter.write("Some string");

        } catch (IOException e) {
            e.printStackTrace();
        }

        writeInsectsTest();
    }
}
