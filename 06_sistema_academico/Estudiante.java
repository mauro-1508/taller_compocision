public class Estudiante {
    private String nombre;
    private String ti;

    public Estudiante(String nombre, String ti) {
        this.nombre = nombre;
        this.ti = ti;
    }

    public void printInfo() {
        System.out.println("Estudiante: " + nombre + " - TI: " + ti);
    }
}
