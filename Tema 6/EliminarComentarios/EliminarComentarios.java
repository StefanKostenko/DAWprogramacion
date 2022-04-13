package EliminarComentarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EliminarComentarios {
    
    public void borrarCOmentario() throws IOException{
        
        FileReader archivo = new FileReader("Tema 6/EliminarComentarios/Prueba.java");
        BufferedReader br = new BufferedReader(archivo);
        PrintWriter pw = new PrintWriter("Tema 6/EliminarComentarios/PruebaSinComentarios.java");

        String linia;
        String liniaSinEspacios;
        String principioDeLinea;

        while((linia = br.readLine())!= null){

            liniaSinEspacios = linia.replaceAll("\\s","");

            if(liniaSinEspacios.length() > 0){

                if(liniaSinEspacios.length() == 1){
                    pw.println(linia);
                }else{
                    principioDeLinea = liniaSinEspacios.substring(0, 2);
            
                    if(principioDeLinea.equals("//")){
                    }else{
                        pw.println(linia);
                    }
                }
            }else{
                pw.println("");
            }
            
        }

        pw.flush();

        pw.close();
        archivo.close();
        br.close();
    }
}
