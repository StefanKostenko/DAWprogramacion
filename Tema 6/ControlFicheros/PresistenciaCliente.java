package ControlFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PresistenciaCliente {

    ArrayList<Cliente> clientes;

    public PresistenciaCliente() {
        clientes = new ArrayList<>();
    }

    public void write() throws IOException{

        try {
 
            BufferedWriter bw = new BufferedWriter(new FileWriter("Tema 6/ControlFicheros/Clientes.dat"));
 
            for (Cliente e : clientes) {
                String cliente = "ID " + e.getId() + ", NIF " + e.getNif() + ", nombre " + e.getNombre() + ", apellidos " + e.getApellidos() + ", email " + e.getEmail() + "\n";
                bw.write(cliente);
            }
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
}

