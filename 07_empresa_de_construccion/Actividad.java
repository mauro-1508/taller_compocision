public class Actividad {
    private String nombre;
    private int duracion;

    public Actividad(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public void printInfo() {
        System.out.println("Actividad: " + nombre + " - Duracion: " + duracion + " dias");
    }
}
