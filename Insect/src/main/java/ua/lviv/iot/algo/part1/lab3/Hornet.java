package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper=true)
public class Hornet extends Insect{
    private int number;
    @Override
    public boolean canInjectPoison() {
        return isDangerous();
    }

    @Override
    public boolean surviveOverWinter() {
        return true;
    }

    Hornet(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, int number) {
        super(name, numberOfLegs, hasWings, isDangerous);
        this.number = number;
    }
}
