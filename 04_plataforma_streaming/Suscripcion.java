public class Suscripcion {
    private String nombre;
    private double precio;
    private String beneficio;

    public Suscripcion(String nombre, double precio, String beneficio) {
        this.nombre = nombre;
        this.precio = precio;
        this.beneficio = beneficio;
    }

    public void printInfo() {
        System.out.println("Suscripcion: " + nombre + " - Precio: " + precio + " - Beneficio: " + beneficio);
    }
}
