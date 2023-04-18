package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper = true)
public final class Hornet extends Insect {
    private String species;

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
        return super.getHeaders() + ",species";
    }

    @Override
    public String getCSV() {
        return super.getCSV() + "," + species;
    }

    public Hornet(final String name, final int numberOfLegs,
            final boolean hasWings, final boolean isDangerous, final String species) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.species = species;
    }
}
