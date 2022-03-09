package CutreCloud;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import javax.xml.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PruebaXPath {
    public static void main(String[] args) throws Exception {
        // La expresion xpath de busqueda
        String xPathExpression = "//usuario/*";

        // Carga del documento xml
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documento = builder.parse(new File("Tema 5/CutreCloud/Usuarios/Usuario0.xml"));

        // Preparación de xpath
        XPath xpath = XPathFactory.newInstance().newXPath();

        // Consultas
        NodeList nodos = (NodeList) xpath.evaluate(xPathExpression, documento, XPathConstants.NODESET);
        for (int i = 0; i < nodos.getLength(); i++) {
            Node node = nodos.item(i);
            System.out.println(node.getTextContent());
        }
    }
}
