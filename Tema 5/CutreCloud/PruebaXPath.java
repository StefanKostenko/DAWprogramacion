package CutreCloud;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class PruebaXPath {
    public static void main(String[] args) throws Exception {
        
        crearUsuariosDeXML();
    }

    private static void crearUsuariosDeXML()
            throws ParserConfigurationException, SAXException, IOException, XPathExpressionException {
        File carpeta = new File("Tema 5/CutreCloud/Usuarios"); 
        File[] lista = carpeta.listFiles();
        int archivos = lista.length;

        for (int i = 0; i <= archivos -1; i++) {
            Aplicacion a1 = new Aplicacion();
        
            String email = "";
            String password = "";
            
            // La expresion xpath de busqueda
            String xPathExpression = "//usuario/*";

            // Carga del documento xml
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.parse(new File("Tema 5/CutreCloud/Usuarios/Usuario" + i + ".xml"));

            // Preparación de xpath
            XPath xpath = XPathFactory.newInstance().newXPath();

            // Consultas
            NodeList nodos = (NodeList) xpath.evaluate(xPathExpression, documento, XPathConstants.NODESET);
            
            for (int j = 0; j < nodos.getLength(); j++) {
                Node node = nodos.item(j);
                if(j == 1){
                    email = node.getTextContent();
                }else if(j == 2){
                    password = node.getTextContent();
                }
            }

            Usuario u = new Usuario(email, password);

            a1.addUsuario(u);

            System.out.println(u.generateXML());
            
        }
    }
        
}
