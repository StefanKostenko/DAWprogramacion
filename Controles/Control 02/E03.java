import java.util.*;
public class E03 {
    public static void main(String[] args) {
        
        int nota1, nota2, nota3, nota4, promedio;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Primera nota: ");
        nota1 = lector.nextInt();

        System.out.println("Segunda nota: ");
        nota2 = lector.nextInt();

        System.out.println("Tercera nota: ");
        nota3 = lector.nextInt();

        System.out.println("Cuarta nota: ");
        nota4 = lector.nextInt();

        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("El promedio es: " + promedio);
        lector.close();
    }
}
