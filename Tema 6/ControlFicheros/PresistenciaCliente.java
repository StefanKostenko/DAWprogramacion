package ControlFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class PresistenciaCliente {

    public static ArrayList<Cliente> clientes;

    public PresistenciaCliente() {
        clientes = new ArrayList<>();
    }

    public void write() throws IOException{

        try {
 
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 6/ControlFicheros/Clientes.dat"));
 
            for (Cliente e : clientes) {
                String cliente = e.getId() + ", " + e.getNif() + ", " + e.getNombre() + ", " + e.getApellidos() + ", " + e.getEmail() + "\n";
                bw.write(cliente);
            }
            bw.close();
        } catch (IOException e) {
            //Captura un posible error le imprime en pantalla   
            e.printStackTrace();
        }
    }

    public ArrayList<Cliente> read() throws IOException{

        ArrayList<Cliente> resultado = new ArrayList<>();

        FileReader ficheroLectura;
        BufferedReader lector;

        try {
            ficheroLectura = new FileReader("Tema 6/ControlFicheros/Clientes.dat");
            lector = new BufferedReader(ficheroLectura);

            String linea;

            while ((linea = lector.readLine()) != null) {
                String [] trozos = linea.split(",");
                int idTrozeado = Integer.parseInt(trozos[0]);
                Cliente cliente = new Cliente(idTrozeado, trozos[1], trozos[2], trozos[3], trozos[4]);
                resultado.add(cliente);
            }
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultado;
    }
}

