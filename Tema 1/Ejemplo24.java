import java.util.Scanner;

public class Ejemplo24 {
    public static void main(String[] args) {
        
        int  nota, notaMedia = 0, suma = 0, contador = 0, notaDiez = 0;
        Scanner valorEntrante;
        valorEntrante = new Scanner(System.in);

        
        System.out.println("Escribeme tus notas para calcular la media y para finalizar escribe el -1: ");
        nota = valorEntrante.nextInt();

        while(nota != -1){
            contador ++;
            suma = suma + nota;
            notaMedia = suma/contador;

            if(nota == 10){
                notaDiez ++;
            }
            
            nota = valorEntrante.nextInt();

        }

        if(notaDiez >= 1){
            System.out.println("Habia al menos un 10 entre todas las notas introducidas.");
        }else{
            System.out.println("NO habia ni un 10 entre todas las notas introducidas.");
        }

        System.out.println("La media de las notas es: " + notaMedia);

        valorEntrante.close();
    }    
}