package Forma;

import java.awt.Point; 

public class Forma {
    private String color;
    private Point centroDelObjeto = new Point();
    private String nombre;

    public Forma(String color, int x, int y, String nombre) {
        this.color = color;
        this.centroDelObjeto = new Point(x, y);
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point getCentroDelObjeto() {
        return centroDelObjeto;
    }

    public void setCentroDelObjeto(Point centroDelObjeto) {
        this.centroDelObjeto = centroDelObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void mover(int x, int y){
        this.centroDelObjeto = new Point(x,y);
    }

    //Imprimir
    public void Imprimir() {
        System.out.println("Color: " + color + " Centro del objeto: " + centroDelObjeto + "nombre: " + nombre);
    }

}
