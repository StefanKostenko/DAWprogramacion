package ContarPalabras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContarPalabras {
    
    public void leerFichero() throws IOException{
        
        String cadena;
        ArrayList<String> contenido = new ArrayList<>();

        FileReader archivo = new FileReader("Tema 6/ContarPalabras/palabras.txt");
        BufferedReader br = new BufferedReader(archivo);

        while((cadena = br.readLine())!=null) { 
             contenido.add(cadena);
        }

        int contador = 1;
        String palabra = "";

        for (int i = 0; i < contenido.size(); i++) {
            palabra = contenido.get(i);
            contenido.remove(i);
            for (int j = 0; j < contenido.size(); j++) {
                if(palabra.equals(contenido.get(j))){
                    contenido.remove(j);
                    contador++;
                }
            }
        }

        br.close(); 
    }
}
