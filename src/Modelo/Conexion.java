package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/gpsw";
            con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10484637","sql10484637","YrRRH2Lzpl");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}
