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

        FileInputStream fNeg_in = new FileInputStream(file);
        FileOutputStream fNeg_out = new FileOutputStream(getNombreSinExtension(file) + "_n.bmp");

        byte[] buffer = new byte[54];
        int num = fNeg_in.read(buffer);
        while(num != -1){
            fNeg_out.write(buffer,0,num);
        }
        fNeg_in.close();
        fNeg_out.close();
    }

    public void transformaOscuro() throws IOException {

        // Transformar a una imagen más oscura y guardar como *_o.bmp

        
    }

    

    public void transformaBlancoNegro() throws IOException {

        // Transformar a una imagen en blanco y negro y guardar como *_bn.bmp

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
