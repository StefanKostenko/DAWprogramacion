package Forma;

import java.awt.Point;

public class Rectangulo extends Forma {

    private static double LadoMenor;
    private static double LadoMayor;

    public Rectangulo(String color, int x, int y, String nombre, double LadoMayor, double LadoMenor) {
        super(color, x, y, nombre);
        this.LadoMenor = LadoMenor;
        this.LadoMayor = LadoMayor;
    }

    //Calcular el área
    public void areaRectangulo(){
        double areaRectangulo;

        areaRectangulo = LadoMayor*LadoMenor;

        System.out.println(areaRectangulo);
    }

    public void perímetro(){
        double perímetroRectangulo;

        perímetroRectangulo = (LadoMayor * 2) + (LadoMenor * 2);

        System.out.println(perímetroRectangulo);
    }

    public void cambiarTamaño(double procentaje){
        double LadoMayor = getLadoMayor()*procentaje;
        double LadoMenor = getLadoMenor()*procentaje;

        setLadoMayor(LadoMayor);
        setLadoMenor(LadoMenor);
    }

    //Getters y Setters
    public static double getLadoMenor() {
        return LadoMenor;
    }

    public static void setLadoMenor(double ladoMenor) {
        LadoMenor = ladoMenor;
    }

    public static double getLadoMayor() {
        return LadoMayor;
    }

    public static void setLadoMayor(double ladoMayor) {
        LadoMayor = ladoMayor;
    }

    //Imprimir
    public void Imprimir() {
        super.Imprimir();
        System.out.println("Lado Menor: " + LadoMenor);
        System.out.println("Lado Mayor: " + LadoMayor);
    }

}
