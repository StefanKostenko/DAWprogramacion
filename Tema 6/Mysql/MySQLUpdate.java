package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * MySQLInsert
 */
public class MySQLUpdate {

    public static void main(String[] args) throws ClassNotFoundException {
       
        String consulta = " update cliente set nif = ?, nombre = ?, apellidos = ?, email = ? where nif like ?";
        String connectioURL = "jdbc:mysql://10.0.2.4:3306/clientes";
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
       
        Connection conn =DriverManager.getConnection(connectioURL,"phpmyadmin","phpmyadmin");
            PreparedStatement ps = conn.prepareStatement(consulta);
            Scanner lector = new Scanner(System.in);
             
             
            System.out.println("Introduzca el nif");
            String nif = lector.nextLine();

            ps.setString(1, nif);

            System.out.println("Introduzca el nombre");
            String nombre = lector.nextLine();

            ps.setString(2, nombre);

            System.out.println("Inserta el apellidos");
            String apellidos = lector.nextLine();

            ps.setString(3, apellidos);

            System.out.println("Introduzca el email");
            String email = lector.nextLine();

            ps.setString(4, email);
            
            System.out.println("Introduzca el nif del cliente que quiere modificar: ");
            String nifCliente = lector.nextLine();
            
            ps.setString(5, nifCliente);

            ps.executeUpdate();
            conn.close();
            lector.close();
    
        } catch (SQLException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
     }
 }
