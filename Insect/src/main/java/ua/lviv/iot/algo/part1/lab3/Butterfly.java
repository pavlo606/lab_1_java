package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public final class Butterfly extends Insect {
    private String color;

    @Override
    public boolean canInjectPoison() {
        return false;
    }

    @Override
    public boolean surviveOverWinter() {
        return false;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ",color";
    }

    @Override
    public String getCSV() {
        return super.getCSV() + "," + color;
    }

    public Butterfly(final String name, final int numberOfLegs,
                final boolean hasWings, final boolean isDangerous, final String color) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.color = color;
    }
}
