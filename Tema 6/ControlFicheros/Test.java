package ControlFicheros;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        PresistenciaCliente pc = new PresistenciaCliente();
        
        Cliente cl = new Cliente(1, "Y4330765V", "Stefan", "Kostenko", "kostenkostephan@gmail.com");
        Cliente c1 = new Cliente(2, "2134124A", "Adrian", "Gimenez", "adriangom@gmail.com");

        pc.clientes.add(cl);
        pc.clientes.add(c1);

        pc.write();
        System.out.println(cl.toString());
    }
}
