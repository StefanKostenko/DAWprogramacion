package EstadisticasTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EstadisticasTexto {
    
    public void ContarPalabras(){
        int contador = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("Tema 6/EstadisticasTexto/Prueba"));
			
			String linea = br.readLine();
			while (linea != null) {
				//Troceamos línea cortando donde haya espacios en blanco
				String[] palabras = linea.split(" ");
				//Acumulamos las palabras(trozos) obtenidos
				contador += palabras.length;
				//Leemos siguiente línea
				linea = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nPalabras contadas en el texto: " + contador);
    }
}
