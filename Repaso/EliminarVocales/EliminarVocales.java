import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarVocales {
    public static void main(String[] args) throws IOException {
        
        FileReader archivo = new FileReader("Repaso/EliminarVocales/Texto.txt");
        BufferedReader lector = new BufferedReader(archivo);
        PrintWriter escritor = new PrintWriter("Repaso/EliminarVocales/TextoSinVocales.txt");

        String linea;
        String lineaSinVocales;

        while((linea = lector.readLine())!= null){

            lineaSinVocales = linea.replaceAll("[aeiouAEIOU]", "");

            escritor.println(lineaSinVocales);
        }

        archivo.close();
        lector.close();
        escritor.close();
    }
}
