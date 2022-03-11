package Forma;

import java.awt.Point;

public class Rectangulo extends Forma {

    private static int LadoMenor;
    private static int LadoMayor;

    public Rectangulo(String color, Point centroDelObjeto, String nombre, int ladoMenor, int ladoMayor) {
        super(color, centroDelObjeto, nombre);
        this.LadoMenor = ladoMenor;
        this.LadoMayor = ladoMayor;
    }

    //Calcular el área
    private static void areaRectangulo(){
        int areaRectangulo;

        areaRectangulo = LadoMayor*LadoMenor;

        System.out.println(areaRectangulo);
    }

    private static void perímetro(){
        int perímetroRectangulo;

        perímetroRectangulo = (LadoMayor * 2) + (LadoMenor * 2);

        System.out.println(perímetroRectangulo);
    }

    private static void cambiarTamaño(int procentaje){
        int LadoMayor = getLadoMayor()*procentaje;
        int LadoMenor = getLadoMenor()*procentaje;

        setLadoMayor(LadoMayor);
        setLadoMenor(La);
    }

    //Getters y Setters
    public static int getLadoMenor() {
        return LadoMenor;
    }

    public static void setLadoMenor(int ladoMenor) {
        LadoMenor = ladoMenor;
    }

    public static int getLadoMayor() {
        return LadoMayor;
    }

    public static void setLadoMayor(int ladoMayor) {
        LadoMayor = ladoMayor;
    }

    //Imprimir
    @Override
    public String toString() {
        return "Rectangulo [LadoMayor=" + LadoMayor + ", LadoMenor=" + LadoMenor + "]";
    }

}
