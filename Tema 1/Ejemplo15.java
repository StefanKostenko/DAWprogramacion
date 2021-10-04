import java.util.Scanner;
public class Ejemplo15 {
    public static void main(String[] args) {
        int numero;

        System.out.println("Escribeme aqui un numero entero de 0 a 15: ");
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        numero = valorEntrante.nextInt();

        valorEntrante.close();
        
        switch(numero){
            case 0:
            System.out.println("Cero");
            break;
            case 1:
            System.out.println("Uno");
            break;
            case 2:
            System.out.println("Dos");
            break;
            case 3:
            System.out.println("Tres");
            break;
            case 4:
            System.out.println("Cuatro");
            break;
            case 5:
            System.out.println("Cinco");
            break;
            case 6:
            System.out.println("Seis");
            break;
            case 7:
            System.out.println("Siete");
            break;
            case 8:
            System.out.println("Ocho");
            break;
            case 9:
            System.out.println("Nueve");
            break;
            case 10:
            System.out.println("Diez");
            break;
            case 11:
            System.out.println("Once");
            break;
            case 12:
            System.out.println("Doce");
            break;
            case 13:
            System.out.println("Trece");
            break;
            case 14:
            System.out.println("Catorche");
            break;
            case 15:
            System.out.println("Quince");
            break;
        }
    }
}