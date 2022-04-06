import java.io.File;
import java.io.IOException;

public class MezclaTest {
    public static void main(String[] args) {
        Mezcla m1 = new Mezcla();
        try {
            m1.mezcla();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
