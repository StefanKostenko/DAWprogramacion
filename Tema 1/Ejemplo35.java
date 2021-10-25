import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {
        
        int  nota[] = new int[10];
        int notaMedia = 0, suma = 0, contador = 0, notaDiez = 0;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        System.out.println("Escribeme tus notas para calcular la media y para finalizar escribe el -1: ");
        nota = valorEntrante.nextInt();

        valorEntrante.close();
    }    
}