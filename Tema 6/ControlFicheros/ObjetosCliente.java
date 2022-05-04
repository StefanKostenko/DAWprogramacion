package ControlFicheros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjetosCliente {

    private static void crearClientes() throws IOException, FileNotFoundException {
        ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Tema 6/ControlFicheros/Clientes.obj"));
        
        int[] id = {1,2,3,4};
        String[] nif = {"12343124Y","24354567A","07893241U","34783274L"};
        String[] nombre = {"Andres","Santi","Claudia","Denis"};
        String[] apellidos = {"Vidal","Santos","Torres","Balaguer"};
        String[] email = {"as@gmail.com", "re@gmail.com", "wq@gmail.com","pt@gmail.com"};

        Cliente c;

        for (int i = 0; i < id.length; i++) {
            c = new Cliente(id[i], nif[i], nombre[i], apellidos[i], email[i]);
            escritor.writeObject(c);
        }
        escritor.close();
    }

    private static void leerObjetos() throws IOException, ClassNotFoundException{

        ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Tema 6/ControlFicheros/Clientes.obj"));

        Cliente c;

        try{
            while(true){
                c = (Cliente) lector.readObject();

                System.out.println("id: " + c.getId() + ", nif: " + c.getNif() + ", nombre: " + c.getNombre() + ", apellidos: " + c.getApellidos() + ", email: " + c.getEmail());
            }
        } catch (EOFException eof){
            lector.close();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        crearClientes();
        leerObjetos();
    }
    
}
