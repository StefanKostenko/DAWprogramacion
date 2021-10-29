import java.util.Scanner;
public class Entrada {
    public static int getInteger(){
        Scanner lector;
        lector = new Scanner(System.in);
        boolean entero;
        int numero = 0;

        System.out.println("Dame un numero: ");

        while(true){
            if(lector.hasNextInt()){
                numero = lector.nextInt();
                break;
            }else{
                System.out.println("El numero no es entero!");
                lector.next();
            }
        }
        System.out.println("El numero es entero");
        lector.nextLine();

        return numero;
    } 
}
