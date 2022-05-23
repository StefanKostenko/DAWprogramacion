package Agenda;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    
    public static ArrayList<UsuarioAgenda> usuarios = new ArrayList<>();

    public void pedirUsuarios() {
        String nombre;
        String apellidos;
        String email;
        int telefono;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Escribeme el nombre del usuario: ");
        nombre = lector.nextLine();

        System.out.println("Escribeme los apellidos del usuario: ");
        apellidos = lector.nextLine();

        System.out.println("Escribeme el email del usuario: ");
        email = lector.nextLine();

        System.out.println("Escribeme el telefono del usuario: ");
        telefono = lector.nextInt();

        UsuarioAgenda u = new UsuarioAgenda(nombre, apellidos, email, telefono);

        usuarios.add(u);

        try {
 
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 6/Agenda/agenda.dat"));
 
            for (UsuarioAgenda e : usuarios) {
                String usuario =  e.getNombre() + "\t" + e.getApellidos() + "\t" + e.getEmail() + "\t" + e.getTelefono() + "\n";
                bw.write(usuario);
            }
            bw.close();
        } catch (IOException e) {
            //Captura un posible error le imprime en pantalla   
            e.printStackTrace();
        }
    }

    public void leerListadoTexto(){

    }

    public void leerListadoObjetos(){

    }
}
