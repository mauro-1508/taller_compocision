import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String placa;
    private List<Orden> ordenes;

    public Vehiculo(String placa) {
        this.placa = placa;
        this.ordenes = new ArrayList<>();
    }

    // Composición: la orden pertenece al vehículo dentro del sistema.
    public void crearOrden(String fecha, String descripcion) {
        ordenes.add(new Orden(fecha, descripcion));
    }

    public Orden getOrden(int index) {
        return ordenes.get(index);
    }

    public void printInfo() {
        System.out.println("Vehiculo: " + placa + " - Ordenes: " + ordenes.size());
    }
}
