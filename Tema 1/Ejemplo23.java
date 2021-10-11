import java.util.Scanner;

public class Ejemplo23 {
    public static void main(String[] args) {
        
        int  numero, positivos;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        positivos = 0;
        
        System.out.println("Escribeme numeros enteros positivos o negativos paras saber cuantos son positivos para acabar pon un 0: ");
        numero = valorEntrante.nextInt();

        while(numero != 0){
            
            if(numero >= 0){
                positivos = positivos + 1;
            }
            numero = valorEntrante.nextInt();
        }
        System.out.println("Hay " + positivos + " numeros positivos.");
        valorEntrante.close();
    }    
}