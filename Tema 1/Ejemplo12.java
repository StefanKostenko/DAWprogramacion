import java.util.Scanner;
public class Ejemplo12 {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        System.out.println("Escribeme el primer numero : ");
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        numero1 = valorEntrante.nextInt();

        System.out.println("Escribeme el segundo numero : ");
        Scanner valorEntrante2;
        valorEntrante2 = new Scanner(System.in);
        numero2 = valorEntrante2.nextInt();
        valorEntrante.close();
        valorEntrante2.close();

        if(numero1 >= numero2){
            System.out.println("********************** " + numero1 + " **********************");
        }else{
            System.out.println("********************** " + numero2 + " **********************");
        }
    }
}
