package Persona;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class TextPersonaXML {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
        PersonaXML px1 = new PersonaXML("Antoni", "Balguer", 21, "123897123A", "Jamaica");
        PersonaXML px2 = new PersonaXML("Andres", "Antonio", 22, "89801410B", "Canada");

        px1.generarXML();
        px2.generarXML();
    }
}
