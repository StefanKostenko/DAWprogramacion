import java.util.Scanner;

public class Positivos10 {
    public static void positivos(int[] valores) {
        int resultado = 0;

        for (int i=0; i < valores.length; i++) {
            if (valores[i] >= 0) {
                resultado++;
            }
        }
        System.out.println(resultado);
    }
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner lector = new Scanner(System.in);

        System.out.println("Dame un numero: ");
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lector.nextInt();
        }

        positivos(numeros);

        lector.close();
    }
}