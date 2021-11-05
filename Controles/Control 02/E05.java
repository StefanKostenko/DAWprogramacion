import java.util.*;
public class E05 {
    public static void main(String[] args) {
        
        int numero;
        char invertido1, invertido2, invertido3;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Ingrese numero: ");
        numero = lector.nextInt();

        String numeroString = numero + "";
		
        invertido1 = numeroString.charAt(2);
        invertido2  = numeroString.charAt(1);
        invertido3  = numeroString.charAt(0);
        System.out.println(invertido1 + "" +  invertido2 + "" + invertido3);
    }
}
