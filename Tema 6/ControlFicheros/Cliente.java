package ControlFicheros;

public class Cliente extends Persona {
    
    private static final long serialVersionUID = 1L;
    private int id;
    private String email;

    public Cliente(int id,String nif, String nombre, String apellidos, String email) {
        super(nif, nombre, apellidos);
        this.id = id;
        this.email = email;
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

    @Override
    public String toString() {
        return "id\t" + id + "\nnif\t" + nif + "\nnombre\t" + nombre + "\napellidos\t" + apellidos + "\nemail\t" + email;
    }
}
