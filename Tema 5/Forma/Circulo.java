package Forma;

public class Circulo extends Elipse{

    private double radio;

    public Circulo(String color, int x, int y, String nombre, double radio) {
        super(color, x, y, nombre, radio, radio);
        this.radio = radio;
    }

    public void areaElipse(){
        super.areaElipse();
    }

    public void Imprimir(){
        super.Imprimir();
    }
    
}
