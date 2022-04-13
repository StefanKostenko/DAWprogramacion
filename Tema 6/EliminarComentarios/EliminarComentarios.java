package EliminarComentarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EliminarComentarios {
    
    public void borrarCOmentario() throws IOException{
        
        FileReader archivo = new FileReader("Tema 6/EliminarComentarios/Prueba.java");
        BufferedReader br = new BufferedReader(archivo);

        String contenido;
        String principioDeLinea;
        int con = 0;

        while((contenido = br.readLine())!= null){

            contenido = contenido.replaceAll("\\s","");

            if(contenido.length() > 1){
                principioDeLinea = contenido.substring(0, 2);
            
                if(principioDeLinea.equals("//")){
                    con++;
                }
            }
            
        }

        System.out.println(con);

        archivo.close();
        br.close();
    }
}
