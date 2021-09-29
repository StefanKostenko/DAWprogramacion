import java.util.Scanner;
public class Ejemplo4{
    public static void main (String argv[]){
        float lado;
        float areaTotal;

        System.out.println("Escribe el lado:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        lado = inputValue.nextFloat();

        areaTotal = lado * lado;
        System.out.println(areaTotal); 
    }
}