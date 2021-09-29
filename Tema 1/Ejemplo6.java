import java.util.Scanner;
public class Ejemplo6 {
    public static void main(String[] args){

        double radio;
        double area;
        double perimetro;
        
        System.out.println("Escribeme el radio de la circunferencia: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        radio = inputValue.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;

        System.out.println("El area  es = " + area);
        System.out.println("El perimetro es = " + perimetro);
        inputValue.close();
    }
}
