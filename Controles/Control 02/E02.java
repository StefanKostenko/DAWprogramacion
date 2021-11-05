import java.util.*;
public class E02 {
   public static void main(String[] args) {
       
        double radio, perimetro, area;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        radio = lector.nextDouble();

        perimetro = 2 * Math.PI * radio;
        area = Math.PI * (radio * radio);

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Área: " + area);

        lector.close();
   } 
}
