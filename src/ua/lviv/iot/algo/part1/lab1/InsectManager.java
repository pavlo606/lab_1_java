package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;

public class InsectManager {
    public static void main(String[] args){
        List<Insect> insects = new ArrayList<Insect>();
        insects.add(new Hornet("hornet", 6, true, true));
        insects.add(new Mosquito("mosquito", 8, true, false));

        for (Insect insect: insects) {
            System.out.println(insect);
        }
    }
}
