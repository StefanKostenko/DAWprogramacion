import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MezclaTest {
    public static void main(String[] args) {
        String direcion1, direcion2;
        Scanner lector = new Scanner(System.in);

        System.out.println("Dame la direcion del primer fichero: ");
        direcion1 = lector.nextLine();

        System.out.println("Dame la direcion del segundo fichero: ");
        direcion2 = lector.nextLine();

        File f1 = new File(direcion1);
        File f2 = new File(direcion2);
        
        Mezcla m1 = new Mezcla();
        try {
            m1.mezcla(f1, f2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
