import java.util.Scanner;
public class Ejemplo27 {
    public static void main(String[] args) {
        
        int numeroDeUsuario;
        Scanner escaner;
        escaner = new Scanner(System.in);

        System.out.println("Escribeme un numero : ");
        numeroDeUsuario = escaner.nextInt();

        escaner.close();    

        for (int i = 1; i <= numeroDeUsuario; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }      
    }
}

