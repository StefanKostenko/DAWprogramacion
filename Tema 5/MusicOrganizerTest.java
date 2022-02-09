public class MusicOrganizerTest {
    public static void main(String[] args) {
        MusicOrganizer m1 = new MusicOrganizer();

        m1.addFile("Cancion1");
        m1.addFile("Cancion2");
        m1.addFile("Cancion3");

        m1.isValidIndex(1);
        m1.listFile(1);
        m1.removeFile(2);
    }
}
