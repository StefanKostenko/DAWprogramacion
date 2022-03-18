package RPG.Character.Race;

import RPG.Character.Stat.Stat;
import RPG.Character.Stat.*;

public class Human extends Race {

    int resultado = 0;
    
    @Override
    public int modifier(Stat stat) {
        if(stat instanceof Strength){
            resultado = 2;
        }else if(stat instanceof Constitution){
            resultado = 2;
        }else if(stat instanceof Dexterity){
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Human";
    }
    
}
