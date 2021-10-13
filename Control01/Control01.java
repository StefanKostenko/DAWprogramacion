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
            System.out.println("Dime la longitud del lado del polígono (con decimales): ");
            longitudDelLadoDelPoligono = escaner.nextDouble();

            System.out.println("El perimetro es: " + ladosDePoligono * longitudDelLadoDelPoligono);
        }else{
            System.out.println("Usted ha introducido mas o menos lados del poligono de los que se permite!");
        }

        escaner.close();

    }
}
