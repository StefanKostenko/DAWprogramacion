import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mayus {
    
    public static void EscribirFichero() throws IOException{

        FileInputStream lector = new FileInputStream("Repaso/Mayus/Texto.txt");
        FileOutputStream escritor = new FileOutputStream("Repaso/Mayus/TextoMayus.txt");

        int caracter = lector.read();

        while(caracter != -1){
            if(Character.isUpperCase(caracter)){
                escritor.write(Character.toLowerCase(caracter));
            }else if(Character.isLowerCase(caracter)){
                escritor.write(Character.toUpperCase(caracter));
            }else{
                escritor.write(caracter);
            }
            caracter = lector.read();
        }

        lector.close();
        escritor.close();
    }

    public static void main(String[] args) throws IOException {
        EscribirFichero();
    }
}
