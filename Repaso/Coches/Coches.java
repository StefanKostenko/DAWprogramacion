import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Coches implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String matricula;
    private String marca;
    private double tamanyoDeposito;
    private String modelo;

    public Coches(String matricula, String marca, double tamañoDeposito, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.tamanyoDeposito = tamañoDeposito;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamañoDeposito() {
        return tamanyoDeposito;
    }

    public void setTamañoDeposito(double tamañoDeposito) {
        this.tamanyoDeposito = tamañoDeposito;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

        
    @Override
    public String toString() {
        return "marca\t" + marca + "\tmatricula\t" + matricula + "\tmodelo\t" + modelo + "\ttamaño Deposito\t"
                + tamanyoDeposito;
    }
    
    public void darAltaCoche() throws FileNotFoundException, IOException{

        ObjectOutputStream escrito;
        File ruta = new File("Repaso/Coches/coches.txt");
        FileOutputStream fichero = new FileOutputStream(ruta, true);

        if (ruta.length() == 0){
            escrito = new ObjectOutputStream(fichero);
        }else{
            escrito = new ObjectOutputStream(fichero){
                @Override
                protected void writeStreamHeader() throws IOException {
                }
            };
        }

        try{
            escrito.writeObject(this);
        }catch(IOException e){
            e.printStackTrace();
        }
        escrito.close();
    }

    public static void leerCochesDeAlta()  throws IOException, ClassNotFoundException{
       
        ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Repaso/Coches/coches.txt"));

        Coches c;
        
        try{
                        
            while(true){
                c = (Coches) lector.readObject();

                System.out.println("marca\t" + c.getMarca() + "\tmatricula\t" + c.getMatricula() + "\tmodelo\t" + c.getModelo() + "\ttamaño deposito\t" + c.getTamañoDeposito());

            }

        }catch(EOFException eof){
            lector.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException { 

        Coches c1 = new Coches("1323AAA", "aaa", 50.0, "bbb");
        Coches c2 = new Coches("3454BBB", "bbb", 60.5, "ccc");

        c1.darAltaCoche();
        c2.darAltaCoche();

        leerCochesDeAlta();
    }
}
