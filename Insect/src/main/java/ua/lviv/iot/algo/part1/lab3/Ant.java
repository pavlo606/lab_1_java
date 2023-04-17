package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper = true)
public final class Ant extends Insect {
    @Override
    public boolean canInjectPoison() {
        return isDangerous();
    }

    @Override
    public boolean surviveOverWinter() {
        return true;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    } 

    @Override
    public String getCSV() {
        return super.getCSV();
    }

    public Ant(final String name, final int numberOfLegs,
            final boolean hasWings, final boolean isDangerous) {
        super(name, numberOfLegs, hasWings, isDangerous);
    }
}
