package CutreCloud;

import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion {
    
    private ArrayList<Media> filesMedia = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void addFilesMedia(Media media){
        filesMedia.add(media);
    }

    public void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public void eliminarUnMedia(String nombre){
        for (Media itemMedia : filesMedia) {
            if(itemMedia.getNombre().equals(nombre)){
                filesMedia.remove(itemMedia);
                break;
            }
        }
    }

    public void eliminarTodos(MediaType tipo){
        Iterator<Media> it = filesMedia.iterator();
        while(it.hasNext()) {
            Media media = it.next();
            if(media.getTipo().equals(tipo)){
                it.remove();
            }
        }
    }

    public void eliminarUsuarioEmail(String email){
        for (Usuario itemUsuario : usuarios) {
            if(itemUsuario.getEmail().equals(email)){
                eliminarMediaUsuario(itemUsuario);
                usuarios.remove(itemUsuario);
                break;
            }
        }
    }

    /*
    private void eliminarMediaUsuario(Usuario iUsuario){
        iUsuario.getId();
        if(iUsuario.getId() == ){

        }
    }
    */

    public void eliminarUsuarioDominio(String dominio){
        for (Usuario itemUsuario : usuarios) {
            if(itemUsuario.getEmail().endsWith(dominio)){
                usuarios.remove(itemUsuario);
            }
        }
    }
}
