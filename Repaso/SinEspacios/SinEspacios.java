import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SinEspacios {
    
    public static void EliminarEspacios() throws IOException{
        
        FileReader archivo = new FileReader("Repaso/SinEspacios/Texto.txt");
        BufferedReader lector = new BufferedReader(archivo);
        PrintWriter escritor = new PrintWriter("Repaso/SinEspacios/TextoSinEspacios.txt");

        String linea;
        String lineaSinEspacios;

        while((linea = lector.readLine())!= null){
            
            lineaSinEspacios = linea.replaceAll("\\s", "");

            escritor.println(lineaSinEspacios);
        }

        archivo.close();
        escritor.close();
        lector.close();
    }

    public static void main(String[] args) throws IOException {
        EliminarEspacios();
    }
}
