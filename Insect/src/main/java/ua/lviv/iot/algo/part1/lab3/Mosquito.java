package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper = true)
public final class Mosquito extends Insect {
    private boolean isVectorOfDisease;

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
        return super.getHeaders() + ",isVectorOfDisease";
    }

    @Override
    public String getCSV() {
        return super.getCSV() + "," + isVectorOfDisease;
    }

    public Mosquito(final String name, final int numberOfLegs,
                final boolean hasWings, final boolean isDangerous, final boolean isVectorOfDisease) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.isVectorOfDisease = isVectorOfDisease;
    }
}
