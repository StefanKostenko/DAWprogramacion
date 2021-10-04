import java.util.Scanner;
public class Ejemplo10 {
    public static void main(String[] args) {
        int numero;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Escribeme un numero : ");
        numero = valorEntrante.nextInt();
        valorEntrante.close();

        if(numero >= 0){
            System.out.println("Es positivo ");
        }else{
            System.out.println("Es negativo ");
        }
    }
}
