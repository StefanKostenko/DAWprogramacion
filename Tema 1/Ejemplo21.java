import java.util.Scanner;

public class Ejemplo21 {
    public static void main(String[] args) {
        
        int anyo;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Escribeme el año que quieres saber si es bisiesto o no: ");
        anyo = valorEntrante.nextInt();

        valorEntrante.close();

        //Condiciones de bisiesto cada año multiple de 4 es bisiesto pero si termina en 0 tieneque ser multiple de 400.
        if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))){
	System.out.println("El año es bisiesto");
        }else{
	System.out.println("El año no es bisiesto");
        }
    }
}
