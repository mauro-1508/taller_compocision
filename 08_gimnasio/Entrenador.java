public class Entrenador {
    private String nombre;
    private String especialidad;

    public Entrenador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void printInfo() {
        System.out.println("Entrenador: " + nombre + " - Especialidad: " + especialidad);
    }
}