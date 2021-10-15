import java.util.Scanner;

public class Ejemplo28 {
    public static void main(String[] args) {
        
        int numeroDeUsuario, divisor = 2;
        boolean esPrimo = true;
        Scanner escaner;
        escaner = new Scanner(System.in);

        System.out.println("Escribeme un numero para saber si es primo o no : ");
        numeroDeUsuario = escaner.nextInt();

        escaner.close();    

        while(divisor < numeroDeUsuario && esPrimo ){
            if(numeroDeUsuario % divisor == 0){
                esPrimo = false;
            }
            divisor++;
        }
        if(esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }

    }
}
