package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public abstract class Insect {
    
    protected String name;
    protected int numberOfLegs;
    protected boolean hasWings = false;
    protected boolean isDangerous = false;

    public abstract boolean canInjectPoison();
    public abstract boolean surviveOverWinter();
}
