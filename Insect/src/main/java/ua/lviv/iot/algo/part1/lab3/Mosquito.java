package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper = true)
public final class Mosquito extends Insect {
    @Override
    public boolean canInjectPoison() {
        return isDangerous();
    }

    @Override
    public boolean surviveOverWinter() {
        return false;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders();
    } 

    @Override
    public String getCSV() {
        return super.getCSV();
    }

    public Mosquito(final String name, final int numberOfLegs,
                final boolean hasWings, final boolean isDangerous) {
        super(name, numberOfLegs, hasWings, isDangerous);
    }
}
