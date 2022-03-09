package CutreCloud;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Media implements ParseXML{
    
    private int id;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario_id;

    private static int contadorMedia = 0;

    private static ArrayList<String> nombres = new ArrayList<>();

    public Media(int id, String nombre, String contenido, MediaType tipo, Usuario usuario_id) {
        this.id = id;
        this.nombre = comprobarEmail(nombre);
        this.contenido = contenido;
        this.tipo = tipo;
        this.usuario_id = usuario_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario_id() {
        return usuario_id;
    }

    public MediaType getTipo() {
        return tipo;
    }

    public void setTipo(MediaType tipo) {
        this.tipo = tipo;
    }


    private String comprobarEmail(String nombre){

        if(nombres.size() == 0){
            nombres.add(nombre);
        }else{
            for (String itemNombre : nombres) {
                if(nombres.contains(nombre)){
                    System.out.println("El nombre ya existe!");
                    break;
                }else{
                    nombres.add(nombre);
                    break;
                }
            }
        }

        return nombre;
    }

    public String generateXML(){
        String xml = "";
        xml += "<usuario>\n";
        xml += "<id> " + this.id + "</id>\n";
        xml += "<nombre> " + this.nombre + "</nombre>\n";
        xml += "<contenido> " + this.contenido + "</contenido>\n";
        xml += "<tipo> " + this.tipo + "</tipo>\n";
        xml += "<usuario_id>\n" + usuario_id.generateXML() + "\n</usuario_id>\n";
        xml += "</usuario>";
        return xml;
    }

    public void writeXML(){
        
        try{
        String ruta = "Tema 5/CutreCloud/Medias/Media" + contadorMedia + ".xml";

        File file = new File(ruta);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(generateXML());
        bw.close();            

        }catch(Exception error){
            error.printStackTrace();
        }

        contadorMedia++;
    }
}
