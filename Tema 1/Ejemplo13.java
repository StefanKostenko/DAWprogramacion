import java.util.Scanner;
public class Ejemplo13 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        String orden;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        Scanner valorEntrante2;
        valorEntrante2 = new Scanner(System.in);

        System.out.println("Escribeme el primer numero : ");
        numero1 = valorEntrante.nextInt();

        System.out.println("Escribeme el segundo numero : ");
        numero2 = valorEntrante.nextInt();

        System.out.println("Escribeme si quieres ver el orden de los numeros ascendente o descendente : ");
        orden = valorEntrante2.nextLine();

        valorEntrante.close();
        valorEntrante2.close();
    

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