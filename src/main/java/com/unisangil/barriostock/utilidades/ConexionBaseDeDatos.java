package com.unisangil.barriostock.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDeDatos {
    
    private static final String URL = "jdbc:mysql://localhost:3306/barriostock";
    private static final String USER = "root";
    private static final String PASSWORD = "Daniel*2003#";
    private static Connection myConn;
    
    public static Connection getInstanciaConexion() throws SQLException {
        if (myConn != null) {
            myConn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Genial, nos conectamos");
        }else{
            System.out.println("Error, no nos logramos conectar");
        }
        return myConn;
    }
    
}
