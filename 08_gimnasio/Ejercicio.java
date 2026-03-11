public class Ejercicio {
    private String nombre;
    private String maquina;

    public Ejercicio(String nombre, String maquina) {
        this.nombre = nombre;
        this.maquina = maquina;
    }

    public void printInfo() {
        System.out.println("Ejercicio: " + nombre + " - Maquina: " + maquina);
    }
}
