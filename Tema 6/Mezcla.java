import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Mezcla {

    File f1 = new File("Tema 6/f1.txt");
    File f2 = new File("Tema 6/f2.txt");

    public void mezcla() throws IOException{
        PrintWriter pw = new PrintWriter("mezcla.txt");
        
        BufferedReader br1 = new BufferedReader(new FileReader("Tema 6/f1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("Tema 6/f2.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.println(line1);
                line1 = br1.readLine();
            }
              
            if(line2 != null)
            {
                pw.println(line2);
                line2 = br2.readLine();
            }
        }

        pw.flush();
          
        // closing resources
        br1.close();
        br2.close();
        pw.close();

    }

}
