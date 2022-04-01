package SistemaDeArchivos.Ejercicio2;
import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 { 

    private static void imprimirContenido(File e) {

        StringBuilder sb = new StringBuilder();

        int contador = 1;
        String flags;
        char directorio;
        char read;
        char write;
        char execute;

        DateFormat formatter;

        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.getDefault());

        if(e.getParent() != null){
            System.out.println("0. " + e.getParent());
        }else{
            System.out.println("0. Directorio padre");
        }

        if(e.canRead() != false){
            read = 'r';
        }else{
            read = '-';
        }

        if(e.canWrite() != false){
            write = 'w';
        }else{
            write = '-';
        }

        if(e.canExecute() != false){
            execute = 'x';
        }else{
            execute = '-';
        }

        if(e.isDirectory()){
            directorio = 'd';
        }else{
            directorio = '-';
        }

        sb.append(directorio);
        sb.append(read);
        sb.append(write);
        sb.append(execute);
        flags = sb.toString();

        for (int j = 0; j < e.listFiles().length; j++) {
            System.out.println(contador + ".- \t" + flags + "\t" +  String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t" + e.listFiles()[j]);

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

