import java.util.ArrayList;
import java.util.List;

public class Plan {
    private String nombre;
    private int duracion;
    private String beneficios;
    private List<Rutina> rutinas;

    public Plan(String nombre, int duracion, String beneficios) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.beneficios = beneficios;
        this.rutinas = new ArrayList<>();
    }

    // Composición: las rutinas pertenecen al plan.
    public void crearRutina(int duracion) {
        rutinas.add(new Rutina(duracion));
    }

    public Rutina getRutina(int index) {
        return rutinas.get(index);
    }

    public void printInfo() {
        System.out.println("Plan: " + nombre + " - Duracion: " + duracion + " meses - Rutinas: " + rutinas.size());
    }
}
