package RPG.Character.Stat;

import RPG.Character.Character;
import RPG.Character.Job.Warrior;
import RPG.Character.Race.Orc;

public class test {
    public static void main(String[] args) {
        Orc o1 = new Orc();

        Warrior w1 = new Warrior();
        
        Character c1 = new Character("Borja", o1, w1, 1, 1, 1, 1);

        c1.receivesDamage(10);

        System.out.println(c1.toString());
    }
}
