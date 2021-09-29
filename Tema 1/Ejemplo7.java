import java.util.Scanner;
public class Ejemplo7 {
    public static void main(String[] args){
        
        double precio_real;
        double precio_rebajado;
        double descuento;

        System.out.println("Escribeme el precio sin descuento del producto : ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        precio_real = inputValue.nextDouble();

        System.out.println("A continuacion escribeme el precio con descuento del producto : ");
        Scanner inputValue2;
        inputValue2 = new Scanner(System.in);
        precio_rebajado = inputValue2.nextDouble();

        descuento = (precio_real - precio_rebajado)/precio_real * 100;
        System.out.println("El descuento es de un " + descuento + "%");
        inputValue.close();
        inputValue2.close();
    }
}
