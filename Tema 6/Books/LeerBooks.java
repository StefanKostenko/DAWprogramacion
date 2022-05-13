package Books;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class LeerBooks {
    public static void main(String[] args) throws Exception{

        String expresionXpath = "//catalog/book/genre[not(. = following::genre/.)]";
    
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documento = builder.parse(new File("Tema 6/Books/Books.xml"));
        
        XPath xpath = XPathFactory.newInstance().newXPath();
        NodeList nodos = (NodeList) xpath.evaluate(expresionXpath, documento, XPathConstants.NODESET);

        for (int i = 0; i < nodos.getLength(); i++) {
            System.out.println(nodos.item(i).getNodeName() + " : " + nodos.item(i).getTextContent());
            
        }
    }
    
}