import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        
        double precio, precioConDes;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Escribeme el precio del producto para saber el precio con su descuento: ");
        precio = valorEntrante.nextDouble();

        valorEntrante.close();
        
         if(precio < 6){
            System.out.println("El producto es inferior a 6 euros asique no se aplicara descuento sobre el. El precio del producto es: " + precio);
        } else if(precio < 60){
            precioConDes = precio * 0.95;
            System.out.println("El precio del producto es: " + precioConDes);
        } else if(precio >= 60){
            precioConDes = precio * 0.90;
            System.out.println("El precio del producto es: " + precioConDes);
        } else {
            System.out.println("Error! Ha introducido aalgun valor mal.");
        }
    }
}
