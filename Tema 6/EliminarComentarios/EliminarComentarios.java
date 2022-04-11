package EliminarComentarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EliminarComentarios {
    
    public void BorrarCOmentario() throws IOException{
        
        FileReader archivo = new FileReader("Tema 6/EliminarComentarios/Prueba.java");
        BufferedReader br = new BufferedReader(archivo);

        String contenido;
        String principioDeLinea;
        int con = 0;

        while((contenido = br.readLine())!=null){

            principioDeLinea = contenido.substring(0, 1);

            if(principioDeLinea == "//"){
                con++;
            }
        }

        archivo.close();
        br.close();
    }
}
