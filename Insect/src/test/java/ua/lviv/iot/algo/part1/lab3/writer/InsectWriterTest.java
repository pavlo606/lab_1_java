package ua.lviv.iot.algo.part1.lab3.writer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    private static String RESULT_FILE = "result.csv";
    private static String EXPECTED_FILE = "expected.csv";

    private InsectWriter writer;
    private List<Insect> insects;

    @BeforeEach
    public void setUp() throws IOException{
        writer = new InsectWriter();
        insects = new ArrayList<>();

        insects.add(new Hornet("Hornet1", 6, true, true));
        insects.add(new Ant("Ant1", 6, false, false));
        insects.add(new Hornet("Hornet2", 6, true, true));
        insects.add(new Mosquito("Mosquito1", 6, true, true));
        insects.add(new Mosquito("Mosquito2", 6, true, true));
        insects.add(new Butterfly("Butterfly", 4, true, false));
        insects.add(new Ant("Ant2", 6, false, false));

        Files.deleteIfExists(Path.of(RESULT_FILE));
    }

    @AfterEach
    public void tearDown() throws IOException{
        Files.deleteIfExists(Path.of(RESULT_FILE));
    }

    @Test
    public void fileExistTest() throws IOException{
        writer.writeToFile(insects);
        File file = new File(RESULT_FILE);

        assertTrue(file.exists());
    }

    @Test 
    public void writeInsectsTest() throws IOException{
        writer.writeToFile(insects);
        Path resultFile = Path.of(RESULT_FILE);
        Path expectedFile = Path.of(EXPECTED_FILE);

        assertEquals(-1L, Files.mismatch(resultFile, expectedFile));
    }

    @Test
    public void overrideFileTest() throws IOException{
        FileWriter fileWriter = new FileWriter(RESULT_FILE);

        fileWriter.write("Some string");
        fileWriter.close();

        writeInsectsTest();
    }
}
