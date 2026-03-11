import java.util.ArrayList;
import java.util.List;

public class Constructora {
    private String nombre;
    private List<Proyecto> proyectos;

    public Constructora(String nombre) {
        this.nombre = nombre;
        this.proyectos = new ArrayList<>();
    }

    // Agregación: los proyectos pueden registrarse en la constructora.
    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void printInfo() {
        System.out.println("Constructora: " + nombre + " - Proyectos: " + proyectos.size());
    }
}
