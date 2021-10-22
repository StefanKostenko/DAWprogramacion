import java.util.Scanner;
public class Ejemplo34 {
    public static void main(String[] args) {
        String numeroDNI, numeroDNIsinLetra;
        int valorLetra = 0;
        char[] anArray = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner escaner;
        escaner = new Scanner(System.in);
        
        System.out.println("Dame los numero del NIE para verificar su letra:");
        numeroDNI = escaner.nextLine();

        if(numeroDNI.length() == 8){

            if(numeroDNI.charAt(0) == 'X'){
                valorLetra = 0;
            } else if(numeroDNI.charAt(0) == 'Y'){
                valorLetra = 1;
            } else if(numeroDNI.charAt(0) == 'Z'){
                valorLetra = 2;
            } else {
                System.out.println("Erorr! Algun valor no coincide.");
            }

            numeroDNIsinLetra = numeroDNI.substring(1, numeroDNI.length());
        
            int numEntero = Integer.parseInt(numeroDNIsinLetra);
            int numeroDNIconLetra = Integer.valueOf(String.valueOf(valorLetra) + String.valueOf(numEntero));

            System.out.println(numeroDNI + "" + anArray[numeroDNIconLetra%23]);
        } else {
            System.out.println("Erorr! El numero de digitos no es correcto!");
        }
        escaner.close();
    }    
}
