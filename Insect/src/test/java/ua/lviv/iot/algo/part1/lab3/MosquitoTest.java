package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MosquitoTest {
    private Mosquito mosquito;

    @BeforeEach
    public void setUp() {
        mosquito = new Mosquito("Mosquito", 6, true, false, true);
    }

    @Test
    public void canInjectPoisonTest() {
        assertEquals(false, mosquito.canInjectPoison());
    }

    @Test 
    public void surviveOverWinterTest() {
        assertEquals(false, mosquito.surviveOverWinter());
    }

    @Test
    public void getHeadersTest() {
        assertTrue(mosquito.getHeaders().contains(",isVectorOfDisease"));
    }

    @Test
    public void getCSVTest() {
        assertTrue(mosquito.getCSV().contains("," + mosquito.isVectorOfDisease()));
    }
}
