package controlador;

import conexion.ConexionBD;
import modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioControlador {

    public boolean registrarUsuario(Usuario usuario) {
        Connection con = ConexionBD.conectar();
        String sql = "INSERT INTO usuarios (nombre_completo, correo_electronico, contrasena, rol) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombreCompleto());
            ps.setString(2, usuario.getCorreoElectronico());
            ps.setString(3, usuario.getContrasena());
            ps.setString(4, usuario.getRol());
            
            ps.executeUpdate();
            System.out.println("¡Usuario registrado con éxito!");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al registrar: " + e.getMessage());
            return false;
        }
    }
}