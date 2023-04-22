package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HornetTest {
    private Hornet hornet;

    @BeforeEach
    public void setUp() {
        hornet = new Hornet("Hornet", 6, true, true, "Vespa crabro");
    }

    @Test
    public void canInjectPoisonTest() {
        assertEquals(true, hornet.canInjectPoison());
    }

    @Test 
    public void surviveOverWinterTest() {
        assertEquals(true, hornet.surviveOverWinter());
    }

    @Test
    public void getHeadersTest() {
        assertTrue(hornet.getHeaders().contains(",species"));
    }

    @Test
    public void getCSVTest() {
        assertTrue(hornet.getCSV().contains("," + hornet.getSpecies()));
    }
}
