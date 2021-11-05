import java.util.Scanner;
public class E01 {
    public static void main(String[] args) {
        
        String nombre;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = lector.nextLine();

        System.out.println("Hola, " + nombre);
        lector.close();
    }
}
