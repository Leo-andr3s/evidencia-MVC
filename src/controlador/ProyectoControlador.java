package controlador;

import conexion.ConexionBD;
import modelo.Proyecto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProyectoControlador {
    
    public void registrarProyecto(Proyecto proyecto) {
        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO proyectos (nombre_proyecto, descripcion, usuario_id) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // Llenamos los símbolos de interrogación (?) con los datos del objeto
            ps.setString(1, proyecto.getNombreProyecto());
            ps.setString(2, proyecto.getDescripcion());
            ps.setInt(3, proyecto.getUsuarioId());
            
            ps.executeUpdate();
            System.out.println("¡Proyecto registrado con éxito en la base de datos!");
            
        } catch (SQLException e) {
            System.out.println("Error al registrar proyecto: " + e.getMessage());
        } finally {
            try {
                if (con != null) con.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }
    }
}