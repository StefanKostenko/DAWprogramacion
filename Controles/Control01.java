import java.util.Scanner;
public class Control01 {
    public static void main(String[] args) {
        
        int ladosDePoligono;
        double longitudDelLadoDelPoligono;
        Scanner escaner;
        escaner = new Scanner(System.in);

        System.out.println("Dime el número de lados del polígono: ");
        ladosDePoligono = escaner.nextInt();

        if(ladosDePoligono >= 3 && ladosDePoligono <= 4){
            System.out.println("Dime la longitud del lado del polígono: ");
            longitudDelLadoDelPoligono = escaner.nextDouble();

            if(ladosDePoligono == 3){
                System.out.println("El perimetro del triangulo es: " + ladosDePoligono * longitudDelLadoDelPoligono);
            }

            if(ladosDePoligono == 4){
                System.out.println("El perimetro del cuadrado es: " + ladosDePoligono * longitudDelLadoDelPoligono);
            }

        }

        escaner.close();

    }
}
