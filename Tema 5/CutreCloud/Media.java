package CutreCloud;

import java.util.ArrayList;

public class Media implements ParseXML{
    
    private int id;
    private String nombre;
    private String contenido;
    private MediaType tipo;
    private Usuario usuario_id;

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
        xml += "<id> " + id + "</id>\n";
        xml += "<nombre> " + nombre + "</nombre>\n";
        xml += "<contenido> " + contenido + "</contenido>\n";
        xml += "<tipo> " + tipo + "</tipo>\n";
        xml += "<usuario_id> " + usuario_id + "</usuario_id>\n";
        xml += "</usuario>";
        return xml;
    }
}
