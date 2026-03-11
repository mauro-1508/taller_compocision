public class Main {
    public static void main(String[] args) {
        Docente docente = new Docente("Sofia", "Programacion");
        Curso curso = new Curso("POO", "POO101", docente);

        Estudiante estudiante = new Estudiante("Miguel", "2001");
        curso.agregarEstudiante(estudiante);
        curso.crearEvaluacion("2026-03-15", 30);

        curso.printInfo();
        estudiante.printInfo();
    }
}
