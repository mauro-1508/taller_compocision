import java.util.ArrayList;
import java.util.List;

public class Tratamiento {
    private String diagnostico;
    private double costo;
    private String fechaInicio;
    private List<Seccion> secciones;

    public Tratamiento(String diagnostico, double costo, String fechaInicio) {
        this.diagnostico = diagnostico;
        this.costo = costo;
        this.fechaInicio = fechaInicio;
        this.secciones = new ArrayList<>();
    }

    // Composición: las secciones pertenecen al tratamiento.
    public void agregarSeccion(String fecha, String procedimiento) {
        secciones.add(new Seccion(fecha, procedimiento));
    }

    public void printInfo() {
        System.out.println("Tratamiento: " + diagnostico + " - Costo: " + costo);
        System.out.println("Secciones: " + secciones.size());
    }
}
