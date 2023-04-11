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

    public final void addInsect(final Insect insect) {
        insects.add(insect);
    }

    public final List<Insect> findDangerousInsects() {
        return insects.stream()
                        .filter(insect -> insect.isDangerous())
                        .collect(Collectors.toList());
    }

    public final List<Insect> findWithWings() {
        return insects.stream()
                        .filter(insect -> insect.isHasWings())
                        .collect(Collectors.toList());
    }
}
