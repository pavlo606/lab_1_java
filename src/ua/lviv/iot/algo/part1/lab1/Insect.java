package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Insect {
    
    private String name;
    private int numberOfLegs;
    private boolean hasWings = false;
    private boolean isDangerous = false;
    private boolean isSleeping = false;
    private static Insect defaultInsect;

    public static Insect getInstance(){
        if (defaultInsect == null){
            defaultInsect = new Insect();
        }
        return defaultInsect;
    }

    public boolean isPoisonous() {
        return isDangerous;
    }

    public void hibernate() {
        System.out.println(name+" has been hibernate.");
    }
    
    public void wakeUp() {
        System.out.println(name+" has been wake up.");
    }

    public static void main(String[] args) throws Exception {
        Insect insects[] = {
            new Insect(),
            new Insect("mosquito", 6, true, false, false),
            getInstance(),
            getInstance()
        };
        
        for (Insect insect: insects){
            System.out.println(insect);
        }
    }
}
