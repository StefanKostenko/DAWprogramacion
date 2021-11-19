import java.util.Scanner;

public class Ejemplo39 {
    public static void main(String[] args) {
        int numero;
        Scanner lector = new Scanner(System.in);

        System.out.println("Introduce un numero:" );
        numero = lector.nextInt();

        for (int i = 1; i<= numero; i++) {
            if (numero % i == 0){
                System.out.println(i);
            }
            lector.close();
        }
    }
}