import java.util.Scanner;

public class Mayor {
    public static void mayor(int x) {
        boolean esmayor = false;
        if (x >= 18) {
            esmayor = true;
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad = 0;

        System.out.println("Cual es tu edad?: ");
        edad = lector.nextInt();

        mayor(edad);

        lector.close();
    }
}