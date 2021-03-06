package CutreCloud;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Usuario implements ParseXML {
    
    private int id;
    private String email;
    private String password;

    private static int idGenerator = 0;

    private static ArrayList<Integer> ids = new ArrayList<>();
    private static ArrayList<String> emails = new ArrayList<>();

    public Usuario(String email, String password) {
        this.email = comprobarEmail(email);
        this.password = password;
        this.id = idGenerator++;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String comprobarEmail(String email){

        if(ids.size() == 0){
            emails.add(email);
        }else{
            for (String itemEmail : emails) {
                if(emails.contains(email)){
                    System.out.println("El email ya existe!");
                    break;
                }else{
                    emails.add(email);
                    break;
                }
            }
        }

        return email;
    }

    public String generateXML(){
        String xml = "";
        xml += "<usuario>\n";
        xml += "<id> " + this.id + "</id>\n";
        xml += "<email> " + this.email + "</email>\n";
        xml += "<password> " + this.password + "</password>\n";
        xml += "</usuario>";
        return xml;
    }

    public void writeXML(){

        try{
        String ruta = "Tema 5/CutreCloud/Usuarios/Usuario" + id + ".xml";

        File file = new File(ruta);

        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(generateXML());
        bw.close();            

        }catch(Exception error){
            error.printStackTrace();
        }
    }
}
