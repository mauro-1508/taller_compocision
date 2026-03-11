public class Ingeniero {
    private String nombre;
    private String pin;

    public Ingeniero(String nombre, String pin) {
        this.nombre = nombre;
        this.pin = pin;
    }

    public void printInfo() {
        System.out.println("Ingeniero: " + nombre + " - PIN: " + pin);
    }
}
