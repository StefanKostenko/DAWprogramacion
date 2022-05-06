package ControlFicheros;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ObjetosCliente {

    // Crear objetos apartir de arrays.

    private static void crearClientes() throws IOException, FileNotFoundException {
        ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream("Tema 6/ControlFicheros/Clientes.obj"));
        
        int[] id = {1,2,3,4};
        String[] nif = {"12343124Y","24354567A","07893241U","34783274L"};
        String[] nombre = {"Andres","Santi","Claudia","Denis"};
        String[] apellidos = {"Vidal","Santos","Torres","Balaguer"};
        String[] email = {"as@gmail.com", "re@gmail.com", "wq@gmail.com","pt@gmail.com"};

        Cliente c;

        for (int i = 0; i < id.length; i++) {
            c = new Cliente(id[i], nif[i], nombre[i], apellidos[i], email[i]);
            escritor.writeObject(c);
        }
        escritor.close();
    }

    // Leer los objetos creados.

    private static void leerObjetos() throws IOException, ClassNotFoundException{

        ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Tema 6/ControlFicheros/Clientes.obj"));

        Cliente c;

        try{
            while(true){
                c = (Cliente) lector.readObject();

                System.out.println("id: " + c.getId() + ", nif: " + c.getNif() + ", nombre: " + c.getNombre() + ", apellidos: " + c.getApellidos() + ", email: " + c.getEmail());
            }
        } catch (EOFException eof){
            lector.close();
        }
    }

    // Crear xml a partir de objetos.

    private static void crearClientesXML() throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException{
        ObjectInputStream lector = new ObjectInputStream(new FileInputStream("Tema 6/ControlFicheros/Clientes.obj"));

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = doc.createElement("clientes");
        doc.appendChild(root);

        Cliente c;
        try{
            while(true){
                c = (Cliente) lector.readObject();
                Element emp = doc.createElement("cliente");
                emp.setAttribute("id", Integer.toString(c.getId()));

                Element hijo = doc.createElement("nombre");
                hijo.appendChild(doc.createTextNode(c.getNombre()));
                emp.appendChild(hijo);

                root.appendChild(emp);
            }
        } catch (EOFException eof) {
            lector.close();
        }

        Transformer transformar = TransformerFactory.newInstance().newTransformer();

        DOMSource source = new DOMSource(doc);
        StreamResult resultado = new StreamResult(new FileOutputStream("Tema 6/ControlFicheros/Clientes.xml"));

        transformar.transform(source, resultado);
        
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException{
        crearClientes();
        leerObjetos();
        crearClientesXML();
    }
    
}
