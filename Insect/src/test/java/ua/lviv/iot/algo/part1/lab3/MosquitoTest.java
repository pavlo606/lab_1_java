package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MosquitoTest {
    private Mosquito mosquito;

    @BeforeEach
    public void setUp() {
        mosquito = new Mosquito("Mosquito", 6, true, false);
    }

    @Test
    public void canInjectPoisonTest() {
        assertEquals(false, mosquito.canInjectPoison());
    }

    @Test 
    public void surviveOverWinterTest() {
        assertEquals(false, mosquito.surviveOverWinter());
    }
}
