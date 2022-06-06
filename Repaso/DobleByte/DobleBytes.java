import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DobleBytes {
    public static void main(String[] args) throws IOException {

        /****** 
        String archivco;
        Scanner lectorTeclado = new Scanner(System.in);

        PrintWriter escritor = new PrintWriter("Repaso/DobleByte/TextoDoble.txt");

        System.out.println("Dame la ruta del archivo: ");
        archivco = lectorTeclado.nextLine();

        try(FileReader fileReader = new FileReader(archivco)){
            int caracterLeido = fileReader.read();
            while(caracterLeido!= -1) {
                char caracter = (char) caracterLeido;
                escritor.print(caracter + "" + caracter);
                caracterLeido = fileReader.read();
            }
        }catch(IOException ex){
            System.err.println("Erorr al leer el archivo");
            ex.printStackTrace();
    
        }
        lectorTeclado.close();
        escritor.close();   
    */

        FileInputStream lector = new FileInputStream(args[0]);
        FileOutputStream escritor = new FileOutputStream(args[0] + ".double");

        int caracter = lector.read();

        while(caracter != -1){
            escritor.write(caracter);
            escritor.write(caracter);
            caracter = lector.read();
        }

        lector.close();
        escritor.close();
    }
}

