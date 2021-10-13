import java.util.Scanner;
public class Ejemplo25 {
    public static void main(String[] args) {
        
        int numero, factorial = 1;
        Scanner escaner;
        escaner = new Scanner(System.in);

        System.out.println("Escribeme el numero para saber el factorial del mismo: ");
        numero = escaner.nextInt();

        while(numero != 0){
            factorial = factorial*numero;
            numero--;

        }
        System.out.println(factorial);
        escaner.close();
    }
}

