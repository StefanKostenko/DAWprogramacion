package RPG.Character.Race;

import RPG.Character.Stat.Stat;
import RPG.Character.Stat.*;

public class Sorcerer extends Race {

    int resultado = 0;

    @Override
    public int modifier(Stat stat) {
        if(stat instanceof Strength){
            resultado = -1;
        }else if(stat instanceof Constitution){
            resultado = 3;
        }else if(stat instanceof Dexterity){
            resultado = 3;
        }
        return resultado;
    }
    
}
