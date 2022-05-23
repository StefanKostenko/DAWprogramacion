package Agenda;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AgendaTest {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Agenda ag = new Agenda();
        
        ag.pedirUsuarios();
        ag.pedirUsuarios();
    }

}
