public class Guardia {
    private String id;
    private String nombre;

    public Guardia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void printInfo() {
        System.out.println("Guardia: " + nombre + " - ID: " + id);
    }
}
