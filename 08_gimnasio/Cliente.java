import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Plan> planes;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.planes = new ArrayList<>();
    }

    // Agregación: el plan puede existir antes de asignarse al cliente.
    public void agregarPlan(Plan plan) {
        planes.add(plan);
    }

    public void printInfo() {
        System.out.println("Cliente: " + nombre + " - Planes: " + planes.size());
    }
}
