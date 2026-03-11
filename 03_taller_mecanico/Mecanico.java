public class Mecanico {
    private String nombre;
    private String responsable;

    public Mecanico(String nombre, String responsable) {
        this.nombre = nombre;
        this.responsable = responsable;
    }

    public void printInfo() {
        System.out.println("Mecanico: " + nombre + " - Responsable: " + responsable);
    }
}
