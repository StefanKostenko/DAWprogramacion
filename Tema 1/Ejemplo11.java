import java.util.Scanner;
public class Ejemplo11 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Escribeme el primer numero : ");;
        numero1 = valorEntrante.nextInt();

        System.out.println("Escribeme el segundo numero : ");
        numero2 = valorEntrante.nextInt();
       
        valorEntrante.close();

        if(numero1 >= numero2){
            System.out.println("El numero " + numero1 + " es mayor que el numero " + numero2);
        }else{
            System.out.println("El numero " + numero2 + " es mayor que el numero " + numero1);
        }
    }
}
