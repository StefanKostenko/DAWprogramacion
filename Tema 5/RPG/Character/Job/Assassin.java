package RPG.Character.Job;

import RPG.Character.Stat.*;
import RPG.Character.Stat.Stat;

public class Assassin extends Job{

    int resultado = 0;

    @Override
    public int modifier(Stat stat) {
        if(stat instanceof Dexterity){
            resultado = 3;
        }else if(stat instanceof Strength){
            resultado = 1;
        }else if(stat instanceof Constitution){
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Assassin";
    }
    
}
