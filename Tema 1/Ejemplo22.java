import java.util.Scanner;

public class Ejemplo22 {
    public static void main(String[] args) {
        
        int contador, numero, positivos;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        contador = 0;
        positivos = 0;
        
        while(contador < 10){
            System.out.println("Escribeme diez numero enteros positivos o negativos paras saber cuantos son positivos: ");
            numero = valorEntrante.nextInt();
            if(numero >= 0){
                positivos = positivos + 1;
            }
            contador = contador + 1;
        }
        System.out.println("Hay " + positivos + " numeros positivos.");
        valorEntrante.close();
    }    
}
