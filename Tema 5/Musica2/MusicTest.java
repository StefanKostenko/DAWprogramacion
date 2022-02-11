package Musica2;

public class MusicTest {
    public static void main(String[] args) {
        MusicOrganizer m1 = new MusicOrganizer();

        m1.addFile("Hola");
        m1.addFile("Hola1");

        m1.listMaching("Hola");
        m1.findFirst("1");
    }
}
