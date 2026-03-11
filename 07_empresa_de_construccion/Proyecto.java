import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;
    private String ubicacion;
    private double presupuesto;
    private List<Ingeniero> ingenieros;
    private List<Etapa> etapas;

    public Proyecto(String nombre, String ubicacion, double presupuesto) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.presupuesto = presupuesto;
        this.ingenieros = new ArrayList<>();
        this.etapas = new ArrayList<>();
    }

    // Agregación: el ingeniero existe fuera del proyecto.
    public void agregarIngeniero(Ingeniero ingeniero) {
        ingenieros.add(ingeniero);
    }

    // Composición: las etapas pertenecen al proyecto.
    public void crearEtapa(String descripcion) {
        etapas.add(new Etapa(descripcion));
    }

    public Etapa getEtapa(int index) {
        return etapas.get(index);
    }

    public void printInfo() {
        System.out.println("Proyecto: " + nombre + " - Ubicacion: " + ubicacion + " - Presupuesto: " + presupuesto);
        System.out.println("Ingenieros: " + ingenieros.size());
        System.out.println("Etapas: " + etapas.size());
    }
}
