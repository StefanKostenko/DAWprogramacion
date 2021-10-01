import java.util.Scanner;
public class Ejemplo14 {
    public static void main(String[] args) {
        int nota;

        System.out.println("Escribeme aqui la nota de tu examen para saber el valor de la nota: ");
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        nota = valorEntrante.nextInt();

        valorEntrante.close();
        
        switch(nota){
            case 0:
            System.out.println("Muy deficiente");
            break;
            case 1:
            System.out.println("Muy deficiente");
            break;
            case 2:
            System.out.println("Muy deficiente");
            break;
            case 3:
            System.out.println("Insuficiente");
            break;
            case 4:
            System.out.println("Insuficiente");
            break;
            case 5:
            System.out.println("Suficiente");
            break;
            case 6:
            System.out.println("Suficiente");
            break;
            case 7:
            System.out.println("Bien");
            break;
            case 8:
            System.out.println("Notable");
            break;
            case 9:
            System.out.println("Notable");
            break;
            case 10:
            System.out.println("Sobresaliente");
            break;
        }
    }
}
