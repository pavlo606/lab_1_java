package ua.lviv.iot.algo.part1.lab3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public abstract class Insect {
    private String name;
    private int numberOfLegs;
    private boolean hasWings = false;
    private boolean isDangerous = false;

    public abstract boolean canInjectPoison();
    public abstract boolean surviveOverWinter();

    public String getHeaders() {
        return "name,numberOfLegs,hasWings,isDangerous";
    } 

    public String getCSV() {
        return name + "," + numberOfLegs + "," + hasWings + "," + isDangerous;
    }
}
