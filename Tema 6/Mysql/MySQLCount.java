package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLCount {
    public static void main(String[] args) {
        String consulta = "SELECT count(*) as total FROM cliente";
        String connectionUrl = "jdbc:mysql://10.0.2.4:3306/clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(consulta);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int total = rs.getInt("total");
                System.out.println("Total: " + total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}