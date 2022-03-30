package SistemaDeArchivos.Ejercicio1;
import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

    private static void Root() {
        File root = File.listRoots()[0];
        File contenido[] = root.listFiles();

        int contador = 1;

        if(root.getParent() != null){
            System.out.println(root.getParent());
        }else{
            System.out.println("0. Directorio padre");
        }

        for (int j = 0; j < contenido.length; j++) {
            if(contenido[j].isDirectory()){
                System.out.println(contador + ". " + contenido[j] + " <Directorio>");
            }else if(contenido[j].isFile()){
                System.out.println(contador + ". " + contenido[j] + " " + contenido[j].length());
            }

            contador++;
        }
    }

    public static void main(String[] args) {
        Root();

        
    }
}
