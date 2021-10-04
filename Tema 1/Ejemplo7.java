import java.util.Scanner;
public class Ejemplo7 {
    public static void main(String[] args){
        
        double precio_real;
        double precio_rebajado;
        double descuento;
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Escribeme el precio sin descuento del producto : ");
        precio_real = inputValue.nextDouble();

        System.out.println("A continuacion escribeme el precio con descuento del producto : ");
        precio_rebajado = inputValue.nextDouble();

        descuento = (precio_real - precio_rebajado)/precio_real * 100;
        System.out.println("El descuento es de un " + descuento + "%");
        
        inputValue.close();
    }
}
