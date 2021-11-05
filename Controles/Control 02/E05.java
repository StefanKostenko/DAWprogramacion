import java.util.*;
public class E05 {
    public static void main(String[] args) {
        
        int numero;
        String invertido1, invertido2, invertido3;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Ingrese numero: ");
        numero = lector.nextInt();

        String numeroString = numero+"";
		
        invertido1 = numeroString.substring(numeroString.charAt(2));
        invertido2 = numeroString.substring(numeroString.charAt(2));
        invertido3 = numeroString.substring(numeroString.charAt(1));
        System.out.println(invertido1 + invertido2 + invertido3);
        
    }
}
