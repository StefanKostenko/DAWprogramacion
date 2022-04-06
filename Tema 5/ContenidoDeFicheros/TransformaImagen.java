package ContenidoDeFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransformaImagen {

    File f = null;

    public TransformaImagen(File fEnt) {

        // Control de existencia del fichero y control de la extensión .bmp (sacar
        // mensajes de error)

        if(fEnt.exists() == false){    
            System.out.println("El fichero no existe!");
        }


    }

    public void transformaNegativo(File file) throws IOException {

        // Transformar a negativo y guardar como *_n.bmp

        FileInputStream reader = new FileInputStream(file);
        FileOutputStream write = new FileOutputStream("Tema 5/ContenidoDeFicheros/" + getNombreSinExtension(file) + "_n.bmp");

        byte[] contenido = new byte[54];

        reader.read(contenido);
        write.write(contenido);

        int c = 0;

        while(c != -1){
            write.write(((char)(255 - c)));
            c = reader.read();
        }
        reader.close();
        write.close();
    }

    public void transformaOscuro(File file) throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp
        FileInputStream reader = new FileInputStream(file);
        FileOutputStream write = new FileOutputStream("Tema 5/ContenidoDeFicheros/" + getNombreSinExtension(file) + "_o.bmp");

        byte[] contenido = new byte[54];

        reader.read(contenido);
        write.write(contenido);

        int c = 0;

        while(c != -1){
            write.write(((char)(c/2)));
            c = reader.read();
        }
        reader.close();
        write.close();
        
    }

    

    public void transformaBlancoNegro(File file) throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp
        
        FileInputStream reader = new FileInputStream(file);
        FileOutputStream write = new FileOutputStream("Tema 5/ContenidoDeFicheros/" + getNombreSinExtension(file) + "_o.bmp");

        byte[] contenido = new byte[54];

        reader.read(contenido);
        write.write(contenido);

        int c = 0;

        while(c != -1){
            write.write(((char)(c/2)));
            c = reader.read();
        }
        reader.close();
        write.close();
    }

    private String getNombreSinExtension(File file) {

        //Devuelve el nombre del archivo f sin extensión

        String fname = file.getName();
        int pos = fname.lastIndexOf(".");
        if (pos > 0) {
            fname = fname.substring(0, pos);
        }

        return fname;
    }

}
