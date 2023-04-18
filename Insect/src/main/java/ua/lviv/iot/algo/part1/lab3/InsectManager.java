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
public final class InsectManager {
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

    public List<Insect> sortInsects() {
        return insects.stream()
                        .sorted((o1, o2) -> o1.getClass().toString().compareTo(o2.getClass().toString()))
                        .toList();
    }
}
