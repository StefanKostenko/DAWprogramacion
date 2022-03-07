package CutreCloud;

import java.util.*;

public class UsuarioInput {

    private static int opcion = 0;
    private static Scanner lector = new Scanner(System.in); 

    public static void main(String[] args) {
        
        Aplicacion a1 = new Aplicacion();

        mensajeDeBienvenida();

        if(opcion == 1){

            crearUsuario(a1);

            mensajeDeBienvenida();

            while(opcion == 1){
                crearUsuario(a1);

                mensajeDeBienvenida();
            }

        }

        lector.close();
    }

    private static void crearUsuario(Aplicacion a1) {
        System.out.println("Escribe el email del usuario: ");
        String email = lector.next();

        System.out.println("Escribe la contraseña del usuario: ");
        String password = lector.next();

        Usuario u = new Usuario(email, password);

        a1.addUsuario(u);

        u.generateXML();
        u.writeXML();
    }

    private static void mensajeDeBienvenida() {
        System.out.println("*****Bienvinido a CUtreCloud*****");
        System.out.println("1. Pulse 1 para crear un nuevo usuario.");
        System.out.println("2. Pulse 0 para salir del programa.");
        System.out.println("*********************************");

        System.out.println("->");
        opcion = lector.nextInt();
    }
}
