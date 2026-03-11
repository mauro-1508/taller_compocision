import java.util.ArrayList;
import java.util.List;

public class Etapa {
    private String descripcion;
    private List<Actividad> actividades;

    public Etapa(String descripcion) {
        this.descripcion = descripcion;
        this.actividades = new ArrayList<>();
    }

    // Composición: las actividades pertenecen a la etapa.
    public void crearActividad(String nombre, int duracion) {
        
    }

    public void printInfo() {
        System.out.println("Etapa: " + descripcion + " - Actividades: " + actividades.size());
    }
}
