import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumerosAleatorios {
    
    public static void pedirNumeros(){

        Scanner lector = new Scanner(System.in);

        System.out.println("Dame la ruta del fichero que quiero modificar: ");
        String ruta = lector.nextLine();

        System.out.println("Dame un el numero de numeros aleatorios que quiere ingresar al fichero: ");
        int numeros = lector.nextInt();

        int numeroAleatorio;
        
        try{
        //Sirve para seguir escribiendo en el fichero sin borra su contenido.
        PrintWriter escritor = new PrintWriter(new BufferedWriter(new FileWriter(ruta, true)));

        
            for (int i = 0; i < numeros; i++) {
                numeroAleatorio = (int) (Math.random()*100+1);
    
                escritor.println(numeroAleatorio);
            }
            escritor.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        lector.close();
    }

    public static void main(String[] args) throws IOException {
        pedirNumeros();
    }
}
