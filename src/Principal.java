import controlador.ProyectoControlador;
import modelo.Proyecto;

public class Principal {
    
    public static void main(String[] args) {
        
        ProyectoControlador controlProyecto = new ProyectoControlador();

        
        Proyecto proyectoNuevo = new Proyecto(
            "Gerente",
            "Gerenciar las Tiendas Locales",
            2 
        );

        
        System.out.println("Iniciando registro del proyecto...");
        controlProyecto.registrarProyecto(proyectoNuevo);
    }
} 