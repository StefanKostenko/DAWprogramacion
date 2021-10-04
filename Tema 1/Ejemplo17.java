import java.util.Scanner;

public class Ejemplo17 {
    public static void main(String[] args) {
        
        String mes;

        System.out.println("Escribeme el mes para saber el numero de dias que tiene: ");
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);
        mes = valorEntrante.nextLine();

        valorEntrante.close();

        switch(mes){
            case "Enero":
            System.out.println("El mes de enero tiene 31 dias");
            break;

            case "Febrero":
            System.out.println("El mes de febrero tiene 28 dias o 29 si es un año bisiesto");
            break;

            case "Marzo":
            System.out.println("El mes de marzo tiene 31 dias");
            break;

            case "Abril":
            System.out.println("El mes de abril tiene 30 dias");
            break;

            case "Mayo":
            System.out.println("El mes de mayo tiene 31 dias");
            break;

            case "Junio":
            System.out.println("El mes de junio tiene 30 dias");
            break;

            case "Julio":
            System.out.println("El mes de julio tiene 31 dias");
            break;

            case "Agosto":
            System.out.println("El mes de agosto tiene 31 dias");
            break;

            case "Septiembre":
            System.out.println("El mes de septiembre tiene 30 dias");
            break;

            case "Octubre":
            System.out.println("El mes de octubre tiene 31 dias");
            break;

            case "Noviembre":
            System.out.println("El mes de enero tiene 30 dias");
            break;

            case "Diciembre":
            System.out.println("El mes de enero tiene 31 dias");
            break;

            default:
            System.out.println("Error!");
            break;
        }
    }
}
