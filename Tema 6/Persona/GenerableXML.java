package Persona;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

public interface GenerableXML {
    public void generarXML() throws ClassNotFoundException, IOException, ParserConfigurationException, TransformerConfigurationException, TransformerFactoryConfigurationError, TransformerException;
}
