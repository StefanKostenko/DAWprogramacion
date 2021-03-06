package RPG.Character.Stat;

public abstract class Stat {
    private int value;

    public Stat(int value) {
        this.value = value;
    }

    //Getters
    public int getValue() {
        return value;
    }

    public void increase(){
        value++;
    }

    public void decrease(){
        value--;
    }

    @Override
    public String toString() {
        return " " + value;
    }

}
