package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper=true)
public class Hornet extends Insect{
    @Override
    public boolean canInjectPoison() {
        return isDangerous();
    }

    @Override
    public boolean surviveOverWinter() {
        return true;
    }

    Hornet(String name, int numberOfLegs, boolean hasWings, boolean isDangerous) {
        super(name, numberOfLegs, hasWings, isDangerous);
    }
}
