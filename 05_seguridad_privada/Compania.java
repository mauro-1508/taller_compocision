import java.util.ArrayList;
import java.util.List;

public class Compania {
    private String nombre;
    private List<Servicio> servicios;

    public Compania(String nombre) {
        this.nombre = nombre;
        this.servicios = new ArrayList<>();
    }

    // Agregación: el servicio puede ser asignado a la compañía.
    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public void printInfo() {
        System.out.println("Compania: " + nombre + " - Servicios: " + servicios.size());
    }
}
