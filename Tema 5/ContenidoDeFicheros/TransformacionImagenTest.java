package ContenidoDeFicheros;

import java.io.File;

import java.io.IOException;

public class TransformacionImagenTest {

    public static void main(String[] args) throws IOException {

        File f = new File("Tema 5/ContenidoDeFicheros/penyagolosa.bmp");

        TransformaImagen ti = new TransformaImagen(f);

        ti.transformaNegativo(f);

        ti.transformaOscuro(f);

        ti.transformaBlancoNegro(f);

        ti.transformaSoloVerde(f);
    }

}