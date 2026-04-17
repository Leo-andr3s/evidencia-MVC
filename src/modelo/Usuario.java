package modelo;

public class Usuario {
    private int id;
    private String nombreCompleto;
    private String correoElectronico;
    private String contrasena;
    private String rol;

    
    public Usuario() {}

   
    public Usuario(String nombreCompleto, String correoElectronico, String contrasena, String rol) {
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // Métodos Getter y Setter (Para leer y escribir los datos)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getContrasena() { return contrasena; }
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}