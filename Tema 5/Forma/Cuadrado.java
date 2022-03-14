package Forma;

public class Cuadrado extends Rectangulo{

    private double lado;

    public Cuadrado(String color, int x, int y, String nombre, double lado) {
        super(color, x, y, nombre, lado, lado);
        this.lado = lado;
    }

    public void perimetroCuadrado(){
        super.perímetro();
    }

    public void areaCuadrado(){
        super.areaRectangulo();
    }

    public void Imprimir(){
        super.Imprimir();
    }
    
}
