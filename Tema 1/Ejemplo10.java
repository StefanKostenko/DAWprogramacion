import java.util.Scanner;
public class Ejemplo10 {
    public static void main(String[] args) {
        int numero;

        System.out.println("Escribeme un numero : ");
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        numero = valorEntrante.nextInt();
        valorEntrante.close();

        if(numero >= 0){
            System.out.println("Es positivo ");
        }else{
            System.out.println("Es negativo ");
        }
    }
}
