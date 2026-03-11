import java.util.ArrayList;
import java.util.List;

public class Viaje {
    private String destino;
    private String fecha;
    private double costo;
    private Cliente cliente;
    private List<ReservaHotel> reservas;
    private List<Actividad> actividades;

    public Viaje(String destino, String fecha, double costo, Cliente cliente) {
        this.destino = destino;
        this.fecha = fecha;
        this.costo = costo;
        this.cliente = cliente;
        this.reservas = new ArrayList<>();
        this.actividades = new ArrayList<>();
    }

    // Composición: reservas y actividades pertenecen al viaje.
    public void crearReservaHotel(String nombre, int habitaciones, int duracion, double costo) {
        reservas.add(new ReservaHotel(nombre, habitaciones, duracion, costo));
    }

    public void crearActividad(String fecha, String actividad) {
        actividades.add(new Actividad(fecha, actividad));
    }

    public void printInfo() {
        System.out.println("Viaje: " + destino + " - Fecha: " + fecha + " - Costo: " + costo);
        cliente.printInfo();
        System.out.println("Reservas: " + reservas.size());
        System.out.println("Actividades: " + actividades.size());
    }
}
