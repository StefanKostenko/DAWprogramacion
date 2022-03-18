package RPG.Character.Job;

import RPG.Character.Stat.Stat;
import RPG.Character.Stat.*;

public class Mage extends Job{

    int resultado = 0;

    @Override
    public int modifier(Stat stat) {
        if(stat instanceof Intelligence){
            resultado = 4;
        }else if(stat instanceof Dexterity){
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Mage";
    }
    
}
