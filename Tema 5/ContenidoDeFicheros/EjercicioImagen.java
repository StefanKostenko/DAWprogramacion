package ContenidoDeFicheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.Graphics2D;
import java.awt.*;
import java.awt.image.BufferedImage;

public class EjercicioImagen {
    File f = null;
    public EjercicioImagen(File fEnt) {        
        if(!fEnt.getName().substring(fEnt.getName().indexOf(".")).equals(".bmp")) {
                
        }
        else {
            f = fEnt;
        }
    }

    public void transformaNegativo() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File fOut = new File("./fichero_n.bmp");
        FileOutputStream writer = new FileOutputStream(fOut);

        byte[] cabecera = new byte[54];
        
        int c = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        c = reader.read();
        while(c != -1) {
            writer.write(((char)(255 - c)));
            c = reader.read();
        }

        reader.close();
        writer.close();
    }

    public void transformaOscuro() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File fOut = new File("./fichero_o.bmp");
        FileOutputStream writer = new FileOutputStream(fOut);

        byte[] cabecera = new byte[54];
        
        int c = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        c = reader.read();
        while(c != -1) {
            writer.write((char)c/2);
            c = reader.read();
        }

        reader.close();
        writer.close();
    }
    public void transformaNegroBlanco() throws IOException {
        FileInputStream reader = new FileInputStream(this.f);
        File fOut = new File("./fichero_nb.bmp");
        FileOutputStream writer = new FileOutputStream(fOut);

        byte[] cabecera = new byte[54];
        
        int r = 0;
        int g = 0;
        int b = 0;

        reader.read(cabecera);
        writer.write(cabecera);

        r = reader.read();
        while(r != -1) {
            g = reader.read();
            b = reader.read();

            int media = (r+g+b)/3;

            writer.write((char)media);
            writer.write((char)media);
            writer.write((char)media);

            r = reader.read();
        }

        reader.close();
        writer.close();
        
    }
}
