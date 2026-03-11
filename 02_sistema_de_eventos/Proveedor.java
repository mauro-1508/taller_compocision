public class Proveedor {
    private String nombre;
    private String servicio;

    public Proveedor(String nombre, String servicio) {
        this.nombre = nombre;
        this.servicio = servicio;
    }

    public void printInfo() {
        System.out.println("Proveedor: " + nombre + " - Servicio: " + servicio);
    }
}
