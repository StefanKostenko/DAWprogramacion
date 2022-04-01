package SistemaDeArchivos.Ejercicio1;
import java.io.File;
import java.util.Scanner;

public class Ejercicio1 { 

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

    private static void mensajeDeRuta(File ruta) {
        System.out.println("Lista de ficheros y directorios del directorio:" + ruta);
        System.out.println("-------------------------------------------------");
    }

    public static void main(String[] args) {
        File ruta = File.listRoots()[0];
        Scanner lector = new Scanner(System.in);

        int opcion = 0;

        mensajeDeRuta(ruta);
        imprimirContenido(ruta);
        System.out.println("Introduce una opcion o (-1 para salir): ");
        opcion = lector.nextInt();

        while(opcion != -1){
    
            if(opcion == 0){
                if(ruta.getParentFile() != null){
                    ruta = ruta.getParentFile();
                    mensajeDeRuta(ruta);
                    imprimirContenido(ruta);
                }else{
                    System.out.println("El directorio no tiene padre!");
                }
            }else if(opcion <= ruta.listFiles().length){
                if(ruta.listFiles()[opcion-1].isDirectory() && ruta.listFiles()[opcion-1].canRead()){
                    ruta = ruta.listFiles()[opcion-1];
                    mensajeDeRuta(ruta);
                    imprimirContenido(ruta);
                }else{
                    System.out.println("No se puede aceder es un fichero!");
                }
            }else if(opcion > ruta.listFiles().length){
                System.out.println("La opcion que ha elegido no esta dentro del rango!");
            }
            System.out.println("Introduce una opcion o (-1 para salir): ");
            opcion = lector.nextInt();
        }

    }

}
