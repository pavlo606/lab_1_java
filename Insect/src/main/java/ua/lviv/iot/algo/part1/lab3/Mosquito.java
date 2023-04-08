package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper=true)
public class Mosquito extends Insect{
    @Override
    public boolean canInjectPoison() {
        return isDangerous();
    }

    @Override
    public boolean surviveOverWinter() {
        return false;
    }

    Mosquito(String name, int numberOfLegs, boolean hasWings, boolean isDangerous) {
        super(name, numberOfLegs, hasWings, isDangerous);
    }
}