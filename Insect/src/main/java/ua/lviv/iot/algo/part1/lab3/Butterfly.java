package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper = true)
public final class Butterfly extends Insect {
    @Override
    public boolean canInjectPoison() {
        return false;
    }

    @Override
    public boolean surviveOverWinter() {
        return false;
    }

    Butterfly(final String name, final int numberOfLegs,
                final boolean hasWings, final boolean isDangerous) {
        super(name, numberOfLegs, hasWings, isDangerous);
    }
}
