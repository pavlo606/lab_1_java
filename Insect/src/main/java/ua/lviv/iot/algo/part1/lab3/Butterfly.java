package ua.lviv.iot.algo.part1.lab3;

import lombok.ToString;

@ToString(callSuper=true)
public class Butterfly extends Insect {
    @Override
    public boolean canInjectPoison() {
        return false;
    }

    @Override
    public boolean surviveOverWinter() {
        return false;
    }
    
    Butterfly(String name, int numberOfLegs, boolean hasWings, boolean isDangerous) {
        super(name, numberOfLegs, hasWings, isDangerous);
    }
}
