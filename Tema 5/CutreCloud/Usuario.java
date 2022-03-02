package CutreCloud;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Usuario implements ParseXML {
    
    private int id;
    private String email;
    private String password;

    private static ArrayList<Integer> ids = new ArrayList<>();
    private static ArrayList<String> emails = new ArrayList<>();

    public Usuario(int id, String email, String password) {
        this.id = comprobarId(id);
        this.email = comprobarEmail(email);
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    private int comprobarId(int id){

        if(ids.size() == 0){
            ids.add(id);
        }else{
            for (Integer itemId : ids) {
                if(ids.contains(id)){
                    System.out.println("El id ya existe!");
                    break;
                }else{
                    ids.add(id);
                    break;
                }
            }
        }
        return id;
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
}
