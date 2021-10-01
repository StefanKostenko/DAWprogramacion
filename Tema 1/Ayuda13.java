import java.util.Scanner;
public class Ayuda13 {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        String orden_des;
        String orden_asc;

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
        valorEntrante3.nextLine();
        valorEntrante3.nextLine("descendente".equals(orden_des));
        valorEntrante3.nextLine("ascendente".equals(orden_asc));

        valorEntrante.close();
        valorEntrante2.close();
        valorEntrante3.close();

        if(orden_asc == "descendente"){
            if(numero1 <= numero2){
                System.out.println(" " + numero1 + " , " + numero2);
            }

        }
        if("descendente".equals(orden_des)){
            if(numero1 <= numero2){
                System.out.println(" " + numero1 + " , " + numero2);
            }
            
        }
    }
}