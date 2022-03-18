package RPG;

import RPG.Character.*;
import RPG.Character.Character;
import RPG.Character.Job.Warrior;
import RPG.Character.Race.Orc;
import RPG.Item.Food.Apple;
import RPG.Item.Potion.GreaterHealingPotion;

public class test {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        
        GreaterHealingPotion g1 = new GreaterHealingPotion();

        Orc o1 = new Orc();

        Warrior w1 = new Warrior();
        
        Character c1 = new Character("Borja", o1, w1, 1, 1, 1, 1);

        c1.receivesDamage(120);

        System.out.println(c1.toString());

        c1.consumes(g1);

        System.out.println(c1.toString());
    }
}
