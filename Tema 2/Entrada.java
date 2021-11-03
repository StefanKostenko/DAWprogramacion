import java.util.Scanner;
public class Entrada {
    public static int getInteger(){
        Scanner lector;
        lector = new Scanner(System.in);
        boolean entero = false;
        int numero = 0;

        System.out.println("Dame un numero: ");

        while(!entero){
            if(lector.hasNextInt()){
                numero = lector.nextInt();
                entero = true;
            }else{
                System.out.println("El numero no es entero!");
            }
            lector.nextLine();
        }
        System.out.println("El numero es entero");

        return numero;
    } 
}
