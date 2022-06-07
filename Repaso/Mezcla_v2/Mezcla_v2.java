import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mezcla_v2 {
    
    public static void Mezclar() throws IOException{

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame la ruta del primer fichero que quieras mezclar: ");
        String archivo1 = lector.nextLine();

        System.out.println("Dame la ruta del segundo fichero que quieras mezclar: ");
        String archivo2 = lector.nextLine();

        File ruta1 = new File(archivo1);
        File ruta2 = new File(archivo2);
        BufferedReader lectorArchivo1 = new BufferedReader(new FileReader(ruta1));
        BufferedReader lectorArchivo2 = new BufferedReader(new FileReader(ruta2));

        String nombreFichero1 = ruta1.getName().replaceFirst("[.][^.]+$", "");

        String nombreFichero2 = ruta2.getName().replaceFirst("[.][^.]+$", "");

        PrintWriter escritor = new PrintWriter("Repaso/Mezcla_v2/" +  nombreFichero1 + nombreFichero2 + ".txt");

        String linea1 = lectorArchivo1.readLine();
        String linea2 = lectorArchivo2.readLine();

        while(linea1 != null){
            escritor.println(linea1);
            linea1 = lectorArchivo1.readLine();
        }

        while(linea2 != null){
            escritor.println(linea2);
            linea2 = lectorArchivo2.readLine();
        }

        lector.close();
        lectorArchivo1.close();
        lectorArchivo2.close();
        escritor.close();
    } 

    public static void main(String[] args) throws IOException {
        Mezclar();
    }
}
