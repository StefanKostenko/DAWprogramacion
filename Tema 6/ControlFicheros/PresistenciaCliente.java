package ControlFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class PresistenciaCliente {

    private ArrayList<Cliente> clientes;

    public PresistenciaCliente() {
        clientes = new ArrayList<>();
    }

    public void write() throws IOException{

        try {
 
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 6/ControlFicheros/Clientes.dat"));
 
            for (Cliente e : clientes) {
                String cliente = e.getId() + e.getNif() + e.getNombre() + e.getApellidos() + e.getEmail() + "\n";
                bw.write(cliente);
            }
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void read(){
    
    Scanner entrada;
    File archivo;
    String a;
    String linea;
   // ArrayList<Double> array = new ArrayList<Double>();
    ArrayList<String> lista = new ArrayList<String>();
    try
    {
        entrada = new Scanner("Tema 6/ControlFicheros/Clientes.dat");
        a = entrada.nextLine();
        archivo = new File(a);
        entrada = new Scanner(archivo);

        int comienzo = 0;
        while(entrada.hasNextLine() && comienzo < 100)
        {

            linea = entrada.nextLine();
           // System.out.println(linea);
            lista.add(linea); //Agrega valor a ArrayList
            comienzo++;
        }

        //Despues de agregar a ArrayList, ordena.
        Collections.sort(lista);
        //Ahora imprime los valores ordenados.
        for(String valor: lista){
            System.out.println(valor);
        }

    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}

