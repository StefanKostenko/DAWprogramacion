package ContarPalabras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContarPalabras {
    
    public void leerFichero() throws IOException{

        String palabra;
        String contenido;
        int contador = 0;

        FileReader archivo = new FileReader("Tema 6/ContarPalabras/palabras.txt");
        BufferedReader br = new BufferedReader(archivo);

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame una palabra: ");
        palabra = lector.nextLine();

        while((contenido = br.readLine())!=null) { 
            String[] palabras = contenido.split(" ");

            for (int i = 0; i < palabras.length; i++) {
                if(palabras[i].equals(palabra)){
                    contador++;
                }
            }
        }

        System.out.println("La palabra " + palabra + " se ha repetido " + contador + " veces.");

        lector.close();
        br.close();
    }
}
