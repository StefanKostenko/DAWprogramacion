package RPG.Character.Job;

import RPG.Character.Stat.Stat;
import RPG.Character.Stat.*;

public class Warrior extends Job {

    int resultado = 0;

    @Override
    public int modifier(Stat stat) {
        if(stat instanceof Strength){
            resultado = 3;
        }else if(stat instanceof Constitution){
            resultado = 2;
        }
        return resultado;
    }
    
}
