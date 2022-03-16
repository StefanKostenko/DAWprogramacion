package RPG.Character.Job;

import RPG.Character.Stat.Stat;

public abstract class Job {
    
    public abstract int modifier(Stat stat);

    @Override
    //Devuelve true si son la misma clase
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }else if (obj == null){
            return false;
        }else{
            return false;   
        }
    }

    @Override
    public String toString() {
        return "Job []";
    }

}
