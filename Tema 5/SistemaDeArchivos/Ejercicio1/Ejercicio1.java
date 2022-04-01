package SistemaDeArchivos.Ejercicio1;
import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {

    private static File ruta = File.listRoots()[0];
    private static Scanner lector = new Scanner(System.in);

    private static void imprimirContenido(File e) {

        int contador = 1;

        if(e.getParent() != null){
            System.out.println("0. " + e.getParent());
        }else{
            System.out.println("0. Directorio padre");
        }

        for (int j = 0; j < e.listFiles().length; j++) {
            if(e.listFiles()[j].isDirectory()){
                System.out.println(contador + ". " + e.listFiles()[j] + " <Directorio>");
            }else if(e.listFiles()[j].isFile()){
                System.out.println(contador + ". " + e.listFiles()[j] + " " + e.listFiles()[j].length());
            }

            contador++;
        }
    }

    public static void main(String[] args) {
        
        int opcion = 0;

        mensajeDeRuta();
        imprimirContenido(ruta);
        System.out.println("Introduce una opcion o (-1 para salir): ");
        opcion = lector.nextInt();

        while(opcion != -1){
    
            if(opcion == 0){
                ruta = ruta.getParentFile();
                mensajeDeRuta();
                imprimirContenido(ruta);
            }else if(opcion <= ruta.listFiles().length){
                ruta = ruta.listFiles()[opcion-1];
                mensajeDeRuta();
                imprimirContenido(ruta);
            }else if(opcion > ruta.listFiles().length){
                System.out.println("La opcion que ha elegido no esta dentro del rango!");
            }
            System.out.println("Introduce una opcion o (-1 para salir): ");
            opcion = lector.nextInt();
        }

    }

    private static void mensajeDeRuta() {
        System.out.println("Lista de ficheros y directorios del directorio:" + ruta);
        System.out.println("-------------------------------------------------");
    }
}
