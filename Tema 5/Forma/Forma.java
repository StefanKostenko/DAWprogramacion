package Forma;

import java.lang.Object;
import java.awt.geom.Point2D;
import java.awt.Point; 



public class Forma {
    private String color;
    private Point centroDelObjeto;
    private String nombre;

    public Forma(String color, Point centroDelObjeto, String nombre) {
        this.color = color;
        this.centroDelObjeto = centroDelObjeto;
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

    public void setCentroDelObjeto(Port centroDelObjeto) {
        this.centroDelObjeto = centroDelObjeto;
    }

    public String getNombre() {
        return nombre;
    }

    //toString
    @Override
    public String toString() {
        return "Forma [centroDelObjeto=" + centroDelObjeto + ", color=" + color + ", nombre=" + nombre + "]";
    }
    
}
