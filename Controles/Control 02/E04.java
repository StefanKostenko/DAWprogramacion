import java.util.*;
public class E04 {
    public static void main(String[] args) {
        
        double centimetros, pulgadas = 2.54;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.print("Ingrese longitud: ");
        centimetros = lector.nextDouble();


        System.out.println(centimetros + " cm = " +  centimetros / pulgadas + " in");
        lector.close();
    }
}
