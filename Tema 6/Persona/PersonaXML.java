package Persona;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class PersonaXML extends Persona implements GenerableXML{

    public PersonaXML(String nombre, String apellidos, int edad, String dni, String domicilio) {
        super(nombre, apellidos, edad, dni, domicilio);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void generarXML() throws ClassNotFoundException, IOException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
        // TODO Auto-generated method stub

        ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Tema 6/Persona/" + getNombre() + getApellidos() + ".persona"));

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("personas");
        doc.appendChild(root);

        PersonaXML px;

        try{
            while(true){
                px = (PersonaXML) lector.readObject();
                Element emp = doc.createElement("nombre");
                emp.setAttribute("nombre", (px.getNombre()));

                Element edad = doc.createElement("edad");
                edad.appendChild(doc.createTextNode(Integer.toString(px.getEdad())));
                emp.appendChild(edad);

                Element apellidos = doc.createElement("apellidos");
                apellidos.appendChild(doc.createTextNode(px.getApellidos()));
                emp.appendChild(apellidos);

                Element domicilio = doc.createElement("domicilio");
                domicilio.appendChild(doc.createTextNode(px.getDomicilio()));
                emp.appendChild(domicilio);

                root.appendChild(emp);
            }
        } catch (EOFException eof) {
            lector.close();
        }

        Transformer transformar = TransformerFactory.newInstance().newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult resultado = new StreamResult(new FileOutputStream("Tema 6/Persona/" + getNombre() + getEdad() + ".xml"));

        transformar.transform(source, resultado);
        
    }
}
