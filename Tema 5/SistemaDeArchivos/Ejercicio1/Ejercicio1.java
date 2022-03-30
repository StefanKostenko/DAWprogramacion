package SistemaDeArchivos.Ejercicio1;
import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

    private static File ruta = File.listRoots()[0];
    private static File contenido[] = ruta.listFiles();
    private static Scanner lector = new Scanner(System.in);

    private static void imprimirContenido() {

        int contador = 1;

        if(ruta.getParent() != null){
            System.out.println("0. " + ruta.getParent());
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
        int opcion = 0;

        while(opcion != -1){
            System.out.println("Lista de ficheros y directorios del directorio:" + ruta);
            System.out.println("-------------------------------------------------");
            imprimirContenido();
            System.out.println("Introduce una opcion o (-1 para salir): ");
            opcion = lector.nextInt();
    
            if(opcion <= contenido.length){
                ruta = contenido[opcion-1];
                imprimirContenido();
            }
        }

    }
}
