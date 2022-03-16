package RPG.Character.Race;

import RPG.Character.Stat.Dexterity;

public class test {
    public static void main(String[] args) {
        
        Dexterity d1 =  new Dexterity(5);

        Human h1 = new Human();

        Gnome g1 = new Gnome();

        h1.modifier(d1);
    }
}
