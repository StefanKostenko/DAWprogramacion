import java.util.Scanner;
public class Ejemplo8 {
    public static void main(String[] args) {
        int edad;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Escribeme tu edad : ");
        edad = valorEntrante.nextInt();
        
        valorEntrante.close();

        if(edad >= 18){
            System.out.println("Mayor de edad ");
        }
    }
}
