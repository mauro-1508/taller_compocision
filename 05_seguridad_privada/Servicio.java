import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private String fechaInicio;
    private int duracion;
    private String empresa;
    private List<Turno> turnos;

    public Servicio(String fechaInicio, int duracion, String empresa) {
        this.fechaInicio = fechaInicio;
        this.duracion = duracion;
        this.empresa = empresa;
        this.turnos = new ArrayList<>();
    }

    // Composición: los turnos pertenecen al servicio.
    public void crearTurno(String horaInicio, String horaFin) {
        turnos.add(new Turno(horaInicio, horaFin));
    }

    public void printInfo() {
        System.out.println("Servicio: " + empresa + " - Inicio: " + fechaInicio + " - Turnos: " + turnos.size());
    }
}
