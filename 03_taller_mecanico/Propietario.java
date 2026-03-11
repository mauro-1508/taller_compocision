import java.util.ArrayList;
import java.util.List;

public class Propietario {
    private String nombre;
    private String numeroId;
    private List<Vehiculo> vehiculos;

    public Propietario(String nombre, String numeroId) {
        this.nombre = nombre;
        this.numeroId = numeroId;
        this.vehiculos = new ArrayList<>();
    }

    // Agregación: el vehículo puede existir y luego asociarse al propietario.
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void printInfo() {
        System.out.println("Propietario: " + nombre + " - ID: " + numeroId);
        System.out.println("Vehiculos: " + vehiculos.size());
    }
}
