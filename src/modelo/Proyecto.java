package modelo;

public class Proyecto {
    private int id;
    private String nombreProyecto;
    private String descripcion;
    private int usuarioId; 
    // Constructor vacío
    public Proyecto() {}

    // Constructor para registrar nuevos
    public Proyecto(String nombreProyecto, String descripcion, int usuarioId) {
        this.nombreProyecto = nombreProyecto;
        this.descripcion = descripcion;
        this.usuarioId = usuarioId;
    }

    // Getters y Setters (Necesarios para que el controlador lea los datos)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombreProyecto() { return nombreProyecto; }
    public void setNombreProyecto(String nombreProyecto) { this.nombreProyecto = nombreProyecto; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public int getUsuarioId() { return usuarioId; }
    public void setUsuarioId(int usuarioId) { this.usuarioId = usuarioId; }
}
