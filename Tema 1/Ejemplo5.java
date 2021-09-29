import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        int division;

        System.out.println("Escribe el primer numero: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        numero1 = inputValue.nextInt();

        System.out.println("Escribe el segundo numero: ");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        numero2 = inputValue2.nextInt();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;

        System.out.println("la suma del" + numero1 + " y " + numero2 + " es = " + suma );
        System.out.println("la resta del " + numero1 + " y " + numero2 + " es = " + resta );
        System.out.println("la multiplicacion del " + numero1 + " y " + numero2 + " es = " + multiplicacion );
        System.out.println("la division del " + numero1 + " y " + numero2 + " es = " + division );
        inputValue.close();
        inputValue2.close();
    }
}
