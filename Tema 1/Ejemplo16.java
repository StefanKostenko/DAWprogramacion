import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        String op;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        Scanner valorEntrante2;
        valorEntrante2 = new Scanner(System.in);

        System.out.println("Escribeme aqui el primer numero de la operacion: ");
        numero1 = valorEntrante.nextInt();

        System.out.println("Escribeme aqui el segundo numero de la operacion: ");
        numero2 = valorEntrante.nextInt();

        System.out.println("Dime que operacion quieres realizar especificando su caracter (+ , - , / , + ): ");
        op = valorEntrante2.nextLine();

        valorEntrante.close();
        valorEntrante2.close();

        switch(op){
            case "+":
            System.out.println("El resultado de la operacion es: " + (numero1+numero2));
            break;

            case "-":
            System.out.println("El resultado de la operacion es: " + (numero1-numero2));
            break;

            case "/":
            System.out.println("El resultado de la operacion es: " + (numero1/numero2));
            break;

            case "*":
            System.out.println("El resultado de la operacion es: " + (numero1*numero2));
            break;
        }
    }    
}
