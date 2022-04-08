package Primos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Primos {
    
    public void escribirPrimos() throws IOException{
        PrintWriter pw = new PrintWriter("Tema 6/Primos/primos.dat");

        for (int i = 3; i <= 500; i++) {
            if(esPrimo(i)){
                pw.println(i);
            }
        }

        pw.flush();

        pw.close();
    }

        public void muestraContenido() throws IOException { 
            
            String cadena; 
            FileReader archivo = new FileReader("Tema 6/Primos/primos.dat");
            BufferedReader br = new BufferedReader(archivo);

            while((cadena = br.readLine())!=null) { 
                System.out.println(cadena); 
            }

            br.close(); 
        }


    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
          return false;
        }
        for (int x = 2; x < numero / 2; x++) {
          // Si es divisible por cualquiera de estos números, no
          // es primo
          if (numero % x == 0)
            return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
      }
}
