public class Capitulo {
    private String nombre;
    private int duracion;

    public Capitulo(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public void printInfo() {
        System.out.println("Capitulo: " + nombre + " - Duracion: " + duracion + " min");
    }
}
