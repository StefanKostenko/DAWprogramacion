package RPG.Item.Potion;

import RPG.Character.Character;
import RPG.Item.Food.IConsumable;

public abstract class Potion implements IConsumable{
    private int power;

    public Potion(int power) {
        this.power = power;
    }

    public void consumedBy(Character character){
        character.heals(power);;
    }
}
