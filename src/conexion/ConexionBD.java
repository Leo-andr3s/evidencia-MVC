package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Datos de tu base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_evidencia1";
    private static final String USER = "root"; 
    private static final String PASSWORD = "1234"; 

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}