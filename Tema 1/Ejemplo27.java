import java.util.Scanner;
public class Ejemplo27 {
    public static void main(String[] args) {
        
        int numeroDeUsuario;
        String lista = "";
        Scanner escaner;
        escaner = new Scanner(System.in);

        System.out.println("Escribeme un numero : ");
        numeroDeUsuario = escaner.nextInt();
        numeroDeUsuario ++;

        escaner.close();    

        for (int i = 1; i < numeroDeUsuario; i++) {
            lista = lista + " " + String.valueOf(i);
            System.out.println(lista);
        }      
    }
}

