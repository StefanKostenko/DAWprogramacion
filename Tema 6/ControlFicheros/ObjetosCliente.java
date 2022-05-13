package ControlFicheros;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

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
        PresistenciaCliente pc = new PresistenciaCliente();

        for (int i = 0; i < id.length; i++) {
            c = new Cliente(id[i], nif[i], nombre[i], apellidos[i], email[i]);
            pc.clientes.add(c);
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


                Element nif = doc.createElement("nif");
                nif.appendChild(doc.createTextNode(c.getNif()));
                emp.appendChild(nif);

                Element nombre = doc.createElement("nombre");
                nombre.appendChild(doc.createTextNode(c.getNombre()));
                emp.appendChild(nombre);

                Element apellidos = doc.createElement("apellidos");
                apellidos.appendChild(doc.createTextNode(c.getApellidos()));
                emp.appendChild(apellidos);

                Element email = doc.createElement("email");
                email.appendChild(doc.createTextNode(c.getEmail()));
                emp.appendChild(email);

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

    // Leer xml de objetos.

    private static void leerClientesXML() throws ParserConfigurationException, SAXException, IOException{

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new FileInputStream("Tema 6/ControlFicheros/Clientes.xml"));
        Element raiz = (Element) doc.getChildNodes().item(0);
        NodeList clientes = raiz.getElementsByTagName("cliente");

        for (int i = 0; i < clientes.getLength(); i++) {
            Element el = (Element) clientes.item(i);
            System.out.println(el.getNodeName() + " " + (i + 1));
            System.out.println("\tid: " + el.getAttribute("id"));
            System.out.println("\tnif: " + el.getElementsByTagName("nif").item(0).getTextContent());
            System.out.println("\tnombre: " + el.getElementsByTagName("nombre").item(0).getTextContent());
            System.out.println("\tapellidos: " + el.getElementsByTagName("apellidos").item(0).getTextContent());
            System.out.println("\temail: " + el.getElementsByTagName("email").item(0).getTextContent());

        }
        System.out.println(raiz.getTextContent());
    }

    // Crear Clientes en JSON
    private static void crearClientesJSON() throws IOException{
    
        PrintWriter writer = new PrintWriter("Tema 6/ControlFicheros/Clientes.json");
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();

        writer.write("[");

        for (int i = 0; i < PresistenciaCliente.clientes.size(); i++) {
            if(i != PresistenciaCliente.clientes.size()-1){
                String prettyPrinting = prettyGson.toJson(PresistenciaCliente.clientes.get(i));
                writer.write(prettyPrinting + ",");
            }else{
                String prettyPrinting = prettyGson.toJson(PresistenciaCliente.clientes.get(i));
                writer.write(prettyPrinting);
            }
        }
        writer.write("]");
        writer.close();

    }
    
    private static void leerJSON() throws IOException{
        BufferedReader lector = new BufferedReader(new FileReader("Tema 6/ControlFicheros/Clientes.json"));
        Gson gson = new Gson();

        Type tipoListaClientes = new TypeToken<List<Cliente>>(){}.getType();
        List<Cliente> clientes = gson.fromJson(lector, tipoListaClientes);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException, SAXException{
        crearClientes();
        leerObjetos();
        crearClientesXML();
        leerClientesXML();
        crearClientesJSON();
        leerJSON();
    }
    
}
