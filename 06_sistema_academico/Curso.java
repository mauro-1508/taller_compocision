import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private String codigo;
    private Docente docente;
    private List<Estudiante> estudiantes;
    private List<Evaluacion> evaluaciones;

    public Curso(String nombre, String codigo, Docente docente) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.docente = docente;
        this.estudiantes = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
    }

    // Agregación: el estudiante existe fuera del curso.
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Composición: la evaluación se crea dentro del curso.
    public void crearEvaluacion(String fecha, int porcentaje) {
        evaluaciones.add(new Evaluacion(fecha, porcentaje));
    }

    public void printInfo() {
        System.out.println("Curso: " + nombre + " - Codigo: " + codigo);
        docente.printInfo();
        System.out.println("Estudiantes: " + estudiantes.size());
        System.out.println("Evaluaciones: " + evaluaciones.size());
    }
}
