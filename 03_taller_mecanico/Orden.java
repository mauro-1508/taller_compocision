import java.util.ArrayList;
import java.util.List;

public class Orden {
    private String fecha;
    private String descripcion;
    private List<Trabajo> trabajos;

    public Orden(String fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.trabajos = new ArrayList<>();
    }

    // Composición: el trabajo depende de la orden.
    public void agregarTrabajo(String problema, double costo) {
        trabajos.add(new Trabajo(problema, costo));
    }

    public void printInfo() {
        System.out.println("Orden: " + fecha + " - " + descripcion + " - Trabajos: " + trabajos.size());
    }
}
