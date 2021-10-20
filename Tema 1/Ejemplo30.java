import java.util.Scanner;

public class Ejemplo30 {
    public static void main(String[] args) {
        
        //Declaracion de variables

        String palabraUsuario;
        int longitud;
        double laMitadDeLaLongitud;
        boolean palindromo = true;
        Scanner escaner;
        escaner = new Scanner(System.in);

        System.out.println("Escribeme una palabra para saber si es palíndroma: ");
        palabraUsuario = escaner.nextLine();

        //Damos el valor a la longitud que es el numero de letras que introduce el usuario.
        //Y calculamos la mitad de la longitud para ultilizarla en el bucle para la condicion de parada.
    
        longitud = palabraUsuario.length();
        laMitadDeLaLongitud = longitud/2;

        for (int i = 1; i < laMitadDeLaLongitud; i++) {
            if(palabraUsuario.charAt(i -1) != palabraUsuario.charAt(longitud - i)){
            palindromo = false;
            }
        }

        if(palindromo == true){
            System.out.println("La palabra es palindroma!");
        } else if(palindromo == false){
            System.out.println("La palabra no es palindroma!");
        }
        escaner.close();
    }
}
