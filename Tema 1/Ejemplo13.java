import java.util.Scanner;
public class Ejemplo13 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        String orden;

        System.out.println("Escribeme el primer numero : ");
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        numero1 = valorEntrante.nextInt();

        System.out.println("Escribeme el segundo numero : ");
        Scanner valorEntrante2;
        valorEntrante2 = new Scanner(System.in);
        numero2 = valorEntrante2.nextInt();

        System.out.println("Escribeme si quieres ver el orden delos numeros ascendente o descendente : ");
        Scanner valorEntrante3;
        valorEntrante3 = new Scanner(System.in);
        orden = valorEntrante3.nextLine();

        valorEntrante.close();
        valorEntrante2.close();
        valorEntrante3.close();

        if(orden.equals("ascendente")) {
            if(numero1 <= numero2) {
                System.out.println(numero1 + ", " + numero2);
            }else{
                System.out.println(numero2 + ", " + numero1);
            }
        }
        
        if(orden.equals("descendente")) {
            if(numero1 >= numero2) {
                System.out.println(numero1 + ", " + numero2);
            }else{
                System.out.println(numero2 + ", " + numero1);
            }
        }
    }
}