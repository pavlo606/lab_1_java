package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ButterflyTest {
    private Butterfly butterfly;

    @BeforeEach
    public void setUp() {
        butterfly = new Butterfly("Butterfly", 4, true, false, "Blue");
    }

    @Test
    public void canInjectPoisonTest() {
        assertEquals(false, butterfly.canInjectPoison());
    }

    @Test 
    public void surviveOverWinterTest() {
        assertEquals(false, butterfly.surviveOverWinter());
    }

    @Test
    public void getHeadersTest() {
        assertTrue(butterfly.getHeaders().contains(",color"));
    }

    @Test
    public void getCSVTest() {
        assertTrue(butterfly.getCSV().contains("," + butterfly.getColor()));
    }
}
