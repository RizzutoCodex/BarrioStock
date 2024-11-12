package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/barrio_stock";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "Daniel*2003#";
    private static Connection myConn;

    public static Connection getInstanciaConexion() throws SQLException {
        if (myConn == null) {
            myConn = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Genial, nos conectamos");
        }
        return myConn;
    }

}