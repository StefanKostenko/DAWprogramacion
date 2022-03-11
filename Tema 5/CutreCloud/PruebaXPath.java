package CutreCloud;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class PruebaXPath {

    public static void crearUsuariosDeXML()
            throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        File carpeta = new File("Tema 5/CutreCloud/Usuarios"); 
        File[] lista = carpeta.listFiles();
        int archivos = lista.length;

        for (int i = 0; i <= archivos -1; i++) {
            Aplicacion a1 = new Aplicacion();
        
            String email = "";
            String password = "";

            // Carga del documento xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(new File("Tema 5/CutreCloud/Usuarios/Usuario" + i + ".xml"));
            Usuario newUser = null;

            email = documento.getElementsByTagName("email").item(0).getTextContent();
            password = documento.getElementsByTagName("password").item(0).getTextContent();

            newUser = new Usuario(email, password);

            a1.addUsuario(newUser);

            System.out.println(newUser.generateXML());
        }
    }
        
}
