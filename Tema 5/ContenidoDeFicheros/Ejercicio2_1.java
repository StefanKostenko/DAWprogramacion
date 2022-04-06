package ContenidoDeFicheros;

import java.io.File;

import java.io.IOException;

public class Ejercicio2_1 {

    public static void main(String[] args) throws IOException {

        File f = new File("Tema 5/ContenidoDeFicheros/penyagolosa.bmp");

        TransformaImagen ti = new TransformaImagen(f);

        ti.transformaNegativo(f);

        //ti.transformaOscuro();

        //ti.transformaBlancoNegro();

    }

}