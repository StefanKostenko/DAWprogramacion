import java.util.Scanner;
public class Ejemplo36 {
    public static void main(String[] args) {
        
        double[] numeros;
        numeros = new double[10];
        Scanner lector;
        lector = new Scanner(System.in);

        double maximo = numeros[0];
        
        System.out.println("Dame 10 numeros para sacar el maximo: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = lector.nextDouble();
        }

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }
        }

        System.out.println(maximo);
        lector.close();
    }
}
