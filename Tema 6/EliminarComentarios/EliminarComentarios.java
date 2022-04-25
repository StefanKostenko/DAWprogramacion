package EliminarComentarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarComentarios {
    
    public void borrarCOmentario() throws IOException{
        
        FileReader archivo = new FileReader("Tema 6/EliminarComentarios/Prueba.java");
        BufferedReader lector = new BufferedReader(archivo);
        PrintWriter escritor = new PrintWriter("Tema 6/EliminarComentarios/PruebaSinComentarios.java");

        String linea;
        String lineaSinEspacios;
        String principioDeLinea;

        while((linea = lector.readLine())!= null){

            lineaSinEspacios = linea.replaceAll("\\s","");

            if(lineaSinEspacios.length() > 0){

                if(lineaSinEspacios.length() == 1){
                    escritor.println(linea);
                }else{
                    principioDeLinea = lineaSinEspacios.substring(0, 2);
            
                    if(principioDeLinea.equals("//")){
                    }else{
                        escritor.println(linea);
                    }
                }
            }else{
                escritor.println("");
            }
            
        }

        escritor.close();
        archivo.close();
        lector.close();
    }
}
