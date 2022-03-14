package Forma;

public class Elipse extends Forma{

    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, int x, int y, String nombre, double radioMayor, double radioMenor) {
        super(color, x, y, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    //Getters
    public double getRadioMayor() {
        return radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }
    
    //Area de una elipse
    public void areaElipse(){
        double areaElipse;
        
        areaElipse = Math.PI*(radioMayor*radioMenor);

        System.out.println("Area de la Elipse: " + areaElipse);
    }

    public void Imprimir(){
        super.Imprimir();
        System.out.println("Radio Mayor: " + radioMayor);
        System.out.println("Radio Menor: " + radioMenor);
    }
}
