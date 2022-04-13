package EliminarComentarios_v3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarComentarios_v3 {
    
    public void borrarCOmentario() throws IOException{
        
        FileReader archivo = new FileReader("Tema 6/EliminarComentarios_v3/Prueba.java");
        BufferedReader br = new BufferedReader(archivo);
        PrintWriter pw = new PrintWriter("Tema 6/EliminarComentarios_v3/PruebaSinComentarios.java");

        String linia;
        String liniaSinEspacios;
        String principioDeLinea;
        String comentariosJavaDoc;

        while((linia = br.readLine())!= null){

            linia = linia.replaceAll("  ", "");

            liniaSinEspacios = linia.replaceAll("\\s","");

            if(liniaSinEspacios.length() > 0){

                if(liniaSinEspacios.length() == 1){
                    if(liniaSinEspacios.equals("*")){
                    }else{
                        pw.println(linia);
                    }
                }else{
                    comentariosJavaDoc = liniaSinEspacios.substring(0, 1);
                    principioDeLinea = liniaSinEspacios.substring(0, 2);
            
                    if(comentariosJavaDoc.equals("*")){
                    }else if(principioDeLinea.equals("//")){
                    }else if(principioDeLinea.equals("/*")){
                    }else if(principioDeLinea.equals("*/")){   
                    }else{
                        pw.println(linia);
                    }
                }
            }
            
        }

        pw.flush();

        pw.close();
        archivo.close();
        br.close();
    }
}