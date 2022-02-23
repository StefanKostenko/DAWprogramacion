package Network;

import java.util.ArrayList;

public class pubMensaje {
    
    private String nombre;
    private String mensaje;
    private int numMegustas;
    private ArrayList<String> comentario;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getNumMegustas() {
        return numMegustas;
    }

    public void setNumMegustas(int numMegustas) {
        this.numMegustas = numMegustas;
    }

    public ArrayList<String> getComentario() {
        return comentario;
    }

    public void setComentario(ArrayList<String> comentario) {
        this.comentario = comentario;
    }

    public pubMensaje() {
        this.nombre = "autor";
        this.mensaje = "mensaje";
        this.numMegustas = 0;
    }

    public pubMensaje(String nombre, String mensaje, int numMegustas, ArrayList<String> comentario) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.numMegustas = numMegustas;
        this.comentario = comentario;
    }


}
