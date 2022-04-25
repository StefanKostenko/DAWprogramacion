package EliminarComentarios_v3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarComentarios_v3 {
    
    public void borrarCOmentario() throws IOException{
        
        FileReader archivo = new FileReader("Tema 6/EliminarComentarios_v3/Prueba.java");
        BufferedReader lector = new BufferedReader(archivo);
        PrintWriter escritor = new PrintWriter("Tema 6/EliminarComentarios_v3/PruebaSinComentarios.java");

        String linea;
        String lineaSinEspacios;
        String principioDeLinea;
        String comentariosJavaDoc;

        while((linea = lector.readLine())!= null){

            linea = linea.replaceAll("  ", "");

            lineaSinEspacios = linea.replaceAll("\\s","");

            if(lineaSinEspacios.length() > 0){

                if(lineaSinEspacios.length() == 1){
                    if(lineaSinEspacios.equals("*")){
                    }else{
                        escritor.println(linea);
                    }
                }else{
                    comentariosJavaDoc = lineaSinEspacios.substring(0, 1);
                    principioDeLinea = lineaSinEspacios.substring(0, 2);
            
                    if(comentariosJavaDoc.equals("*")){
                    }else if(principioDeLinea.equals("//")){
                    }else if(principioDeLinea.equals("/*")){
                    }else if(principioDeLinea.equals("*/")){   
                    }else{
                        escritor.println(linea);
                    }
                }
            }
            
        }

        escritor.close();
        archivo.close();
        lector.close();
    }
}