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
        Insect insects[] = new Insect[4];
        insects[0] = new Insect("Bodya", 8, false, true, false);
        insects[1] = new Insect("mosquito", 6, true, false, false);
        insects[2] = getInstance();
        insects[3] = getInstance();
        insects[2].setName("Bug");

        for (int i = 0; i < 4; i++){
            System.out.println(insects[i]);
        }
    }
}
