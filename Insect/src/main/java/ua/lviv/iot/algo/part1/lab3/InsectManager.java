package ua.lviv.iot.algo.part1.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InsectManager {
    private List<Insect> insects = new ArrayList<>();

    public void addInsect(final Insect insect) {
        insects.add(insect);
    }

    public List<Insect> findDangerousInsects() {
        return insects.stream()
                        .filter(insect -> insect.isDangerous())
                        .collect(Collectors.toList());
    }

    public List<Insect> findWithWings() {
        return insects.stream()
                        .filter(insect -> insect.isHasWings())
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        InsectManager manager = new InsectManager();

        manager.addInsect(new Hornet("first hornet", 6, true, true));
        manager.addInsect(new Hornet("second hornet", 6, true, true));

        manager.addInsect(new Mosquito("first mosquito", 6, true, false));
        manager.addInsect(new Mosquito("second mosquito", 6, true, true));

        manager.addInsect(new Butterfly("first butterfly", 4, true, false));
        manager.addInsect(new Butterfly("second butterfly", 4, true, false));

        manager.addInsect(new Ant("first Ant", 6, false, false));
        manager.addInsect(new Ant("second Ant", 6, false, true));

        System.out.println("Dangerous insects:");
        List<Insect> dangerousInsects = manager.findDangerousInsects();
        dangerousInsects.stream()
                          .forEach(System.out::println);

        System.out.println("\nFlying insects:");
        List<Insect> flyingInsects = manager.findWithWings();
        flyingInsects.stream()
                       .forEach(System.out::println);
    }
}
