import java.util.*;
public class E06 {
    public static void main(String[] args) {
        double catetoA, catetoB, hipotenusa;
        Scanner lector;
        lector = new Scanner(System.in);

        System.out.print("Ingrese cateto a: ");
        catetoA = lector.nextDouble();

        System.out.print("Ingrese cateto b: ");
        catetoB = lector.nextDouble();

        hipotenusa = (catetoA * catetoA) + (catetoB *catetoB);
        hipotenusa  = Math.sqrt(hipotenusa);

        System.out.println("La hipotenusa es " + hipotenusa);
        lector.close();
    }
}
