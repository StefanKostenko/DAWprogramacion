import java.util.*;
public class E08 {
    public static void main(String[] args) {
        
        double numero, decimal;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        numero = lector.nextDouble();

        double parteDecimal = numero % 1; // Lo que sobra de dividir al número entre 1
		double parteEntera = numero - parteDecimal; // Le quitamos la parte decimal usando una resta
		System.out.printf( parteEntera, parteDecimal);
    }
}
