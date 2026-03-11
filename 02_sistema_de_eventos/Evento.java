import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private Cliente cliente;
    private List<Proveedor> proveedores;
    private List<Actividad> actividades;

    public Evento(String nombre, String fecha, String lugar, Cliente cliente) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.cliente = cliente;
        this.proveedores = new ArrayList<>();
        this.actividades = new ArrayList<>();
    }

    // Agregación: el proveedor puede existir fuera del evento.
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }

    // Composición: las actividades nacen dentro del evento.
    public void crearActividad(String horaInicio, int duracion, String responsable) {
       
    }

    public void printInfo() {
        System.out.println("Evento: " + nombre + " - Fecha: " + fecha + " - Lugar: " + lugar);
        cliente.printInfo();
        System.out.println("Proveedores: " + proveedores.size());
        System.out.println("Actividades: " + actividades.size());
    }
}
