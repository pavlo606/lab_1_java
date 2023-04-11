package ua.lviv.iot.algo.part1.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsectManagerTest {
    private List<Insect> insects;
    private InsectManager manager;

    @BeforeEach
    public void setUp() {
        insects = new ArrayList<>();

        insects.add(new Hornet("Hornet", 6, true, true));
        insects.add(new Mosquito("Mosquito", 6, true, true));
        insects.add(new Butterfly("Butterfly", 4, true, false));
        insects.add(new Ant("Ant", 6, false, false));

        manager = new InsectManager(insects);
    }

    @Test
    public void addInsectTest() {
        Hornet hornet = new Hornet("other hornet", 6, true, true);
        int first_size = manager.getInsects().size();
        manager.addInsect(hornet);
        assertEquals(hornet, manager.getInsects().get(manager.getInsects().size() - 1));
        assertEquals(manager.getInsects().size() - first_size, 1);
    }

    @Test
    public void findDangerousInsectsTest() {
        List<Insect> actualInsects = manager.findDangerousInsects();
        List<Insect> expectedInsects = new ArrayList<>();
        expectedInsects = manager.getInsects().stream()
                                                .filter(insect -> insect.isDangerous())
                                                .collect(Collectors.toList());

        assertEquals(expectedInsects, actualInsects);
    }

    @Test
    public void findWithWingsTest() {
        List<Insect> actualInsects = manager.findWithWings();
        List<Insect> expectedInsects = new ArrayList<>();
        expectedInsects = manager.getInsects().stream()
                                                .filter(insect -> insect.isHasWings())
                                                .collect(Collectors.toList());

        assertEquals(expectedInsects, actualInsects);
    }
}
