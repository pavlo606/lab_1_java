package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AntTest {
    private Ant ant;

    @BeforeEach
    public void setUp() {
        ant = new Ant("Ant", 6, false, true, "Fire ant");
    }

    @Test
    public void canInjectPoisonTest() {
        assertEquals(true, ant.canInjectPoison());
    }

    @Test 
    public void surviveOverWinterTest() {
        assertEquals(true, ant.surviveOverWinter());
    }

    @Test
    public void getHeadersTest() {
        assertTrue(ant.getHeaders().contains(",species"));
    }

    @Test
    public void getCSVTest() {
        assertTrue(ant.getCSV().contains("," + ant.getSpecies()));
    }
}
