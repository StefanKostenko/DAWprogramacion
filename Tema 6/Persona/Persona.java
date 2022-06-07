package Persona;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Persona implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private String domicilio;

    public Persona(String nombre, String apellidos, int edad, String dni, String domicilio) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "apellidos=" + apellidos + ", dni=" + dni + ", domicilio=" + domicilio + ", edad=" + edad
                + ", nombre=" + nombre;
    }

    public void serializar() throws FileNotFoundException, IOException{
        ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Tema 6/Persona/" + getNombre() + getApellidos() + ".persona"));
        try{
            escritor.writeObject(this);
        }catch(EOFException eof){
        escritor.close();
        }
    }
}
