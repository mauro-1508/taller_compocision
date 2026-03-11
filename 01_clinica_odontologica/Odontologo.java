public class Odontologo {
    private String nombre;
    private String especialidad;
    private String pin;

    public Odontologo(String nombre, String especialidad, String pin) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.pin = pin;
    }

    public void printInfo() {
        System.out.println("Odontologo: " + nombre + " - Especialidad: " + especialidad);
    }
}
