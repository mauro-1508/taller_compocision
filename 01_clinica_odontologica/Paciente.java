import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String documento;
    private String telefono;
    private List<Tratamiento> tratamientos;

    public Paciente(String nombre, String documento, String telefono) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.tratamientos = new ArrayList<>();
    }

    // Composición: el tratamiento depende del paciente dentro de este ejemplo.
    public void crearTratamiento(String diagnostico, double costo, String fechaInicio) {
        tratamientos.add(new Tratamiento(diagnostico, costo, fechaInicio));
    }

    public Tratamiento getTratamiento(int index) {
        return tratamientos.get(index);
    }

    public void printInfo() {
        System.out.println("Paciente: " + nombre + " - Documento: " + documento);
        System.out.println("Tratamientos: " + tratamientos.size());
    }
}
