package CutreCloud;

public class Test {
    public static void main(String[] args) {
        
        Usuario u1 = new Usuario(123, "gaga@gmail.com", "fsafas");
        Usuario u2 = new Usuario(43, "fghd@gmail.com", "djkfghks");
        Usuario u3 = new Usuario(124, "gfh@tata.com", "dfjgl");
        Usuario u4 = new Usuario(123, "gaga@gmail.com", "asdfas");

        Media m1 = new Media(2346789, "Antonio.jpg", "imagen", MediaType.IMAGEN, u1);

        Media m2 = new Media(2346789, "Borja.mp3", "cancion", MediaType.AUDIO, u2);


        Media m3 = new Media(2346789, "Antonio.jpg", "imagen", MediaType.IMAGEN, u1);

        Aplicacion a1 = new Aplicacion();

        a1.addUsuario(u1);
        a1.addFilesMedia(m1);
        a1.addFilesMedia(m2);
        a1.addFilesMedia(m3);

        a1.eliminarTodos(MediaType.IMAGEN);
    }
}
