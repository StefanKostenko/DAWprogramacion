import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Mezcla {

    public void mezcla(File f1, File f2) throws IOException{
        PrintWriter escritor = new PrintWriter("Tema 6/mezcla.txt");
        
        BufferedReader lector1 = new BufferedReader(new FileReader("Tema 6/f1.txt"));
        BufferedReader lector2 = new BufferedReader(new FileReader("Tema 6/f2.txt"));

        String line1 = lector1.readLine();
        String line2 = lector2.readLine();

        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                escritor.println(line1);
                line1 = lector1.readLine();
            }
              
            if(line2 != null)
            {
                escritor.println(line2);
                line2 = lector2.readLine();
            }
        }

        escritor.flush();
          
        // closing resources
        lector1.close();
        lector2.close();
        escritor.close();

    }

}
