package Persona;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestPersona {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Persona p1 = new Persona("Stefan", "Kostenko", 19, "1314141A", "Av.Barcelona 12B 3A");
        Persona p2 = new Persona("Borja", "Balaguer", 19, "456454323A", "C.Arnau 2B");

        p1.serializar();
        p2.serializar();
    }
}
