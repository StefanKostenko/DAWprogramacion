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
                eliminarMediaUsuario(itemUsuario.getId());
                usuarios.remove(itemUsuario);
                break;
            }
        }
    }

    private void eliminarMediaUsuario(int id){
        Iterator<Usuario> it = usuarios.iterator();

        while(it.hasNext()){
            Usuario usuario = it.next();

            if(usuario.getId() == id){
                it.remove();
            }
        }
        
    }

    public void eliminarUsuarioDominio(String dominio){
        Iterator<Usuario> it = usuarios.iterator();
        
        while(it.hasNext()){
            Usuario usuario = it.next();

            if(usuario.getEmail().endsWith(dominio)){
                it.remove();
            }
        }
    }

}
