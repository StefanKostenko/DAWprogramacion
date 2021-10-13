import java.util.Scanner;
public class Ejemplo26 {
    public static void main(String[] args) {
        
        int numero, multiplicacion = 0, resultado;
        Scanner escaner;
        escaner = new Scanner(System.in);

        System.out.println("Escribeme el numero para ver su tabla de multiplicacion: ");
        numero = escaner.nextInt();

        for (int i = 0; i < 11; i++) {
            if(multiplicacion <= 10){
                resultado = multiplicacion * numero;
                System.out.println(resultado);
            }
            multiplicacion++;
        }
        escaner.close();
    }
}
