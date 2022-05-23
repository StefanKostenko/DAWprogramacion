package Agenda;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    
    public static ArrayList<UsuarioAgenda> usuarios = new ArrayList<>();

    public void pedirUsuarios() throws FileNotFoundException, IOException {
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
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Tema 6/Agenda/agendaObjetos.dat"));

            for (UsuarioAgenda e : usuarios) {
                escritor.writeObject(e);
                String usuario =  e.getNombre() + "\t" + e.getApellidos() + "\t" + e.getEmail() + "\t" + e.getTelefono() + "\n";
                bw.write(usuario);
            }
            bw.close();
            escritor.close();
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
