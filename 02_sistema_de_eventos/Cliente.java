public class Cliente {
    private String nombre;
    private String fondo;

    public Cliente(String nombre, String fondo) {
        this.nombre = nombre;
        this.fondo = fondo;
    }

    public void printInfo() {
        System.out.println("Cliente: " + nombre + " - Fondo: " + fondo);
    }
}
