import java.util.Scanner;
public class Ejemplo33 {
    public static void main(String[] args) {
        int numeroDNI;
        char[] anArray = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner escaner;
        escaner = new Scanner(System.in);
        
        System.out.println("Dame los numero del DNI para verificar su letra 8 digitos:");
        numeroDNI = escaner.nextInt();

        if( numeroDNI > 9999999 && numeroDNI <= 99999999){
            System.out.println(numeroDNI + " " + anArray[numeroDNI%23]);
            escaner.close();
        } else {
            System.out.println("Erorr! El numero de digitos no es correcto!");
        }
    }    
}
