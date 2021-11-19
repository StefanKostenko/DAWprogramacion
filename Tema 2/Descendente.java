import java.util.Scanner;

public class Descendente {
    public static void descendente(int x, int y){
        System.out.println("El orden ascendente es: ");

        if(x < y){
            System.out.println(x);
            System.out.println(y);
        } else if(x > y){
            System.out.println(y);
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner lector = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        numero1 = lector.nextInt();
        
        System.out.println("Dame el segundo numero: ");
        numero2 = lector.nextInt();

        descendente(numero1, numero2);

        lector.close();
    }
}
