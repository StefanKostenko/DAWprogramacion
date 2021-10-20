import java.util.*;
public class Ejemplo32 {
    public static void main(String[] args) {
        
        int[] anArray;
        Scanner escaner;
        escaner = new Scanner(System.in);

        anArray = new int[10];

        System.out.println("Dame 10 numeros diferentes");
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = escaner.nextInt();
        }

        System.out.println("");

        for (int j = 9; j >= 0; j--) {
            System.out.println(anArray[j]);
        }

        escaner.close();
        
    }
}
