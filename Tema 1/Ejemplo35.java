import java.util.Scanner;

public class Ejemplo35 {
    public static void main(String[] args) {
        
        int  nota[] = new int[10];
        double total = 0;
        boolean hayDiez = false;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.println("Escribeme 10 de tus notas para calcular la media:");
        for (int i = 0; i < nota.length; i++) {
            nota[i] = lector.nextInt();
            total += nota[i];

            if(nota[i] == 10){
                hayDiez = true;
            }
        }

        System.out.println("La media es igual: " + (total/10));
        if(hayDiez == true){
            System.out.println("Hay diez!");
        }else{
            System.out.println("No hay diez!");
        }

        lector.close();
    }    
}