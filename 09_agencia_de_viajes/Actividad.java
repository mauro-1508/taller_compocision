public class Actividad {
    private String fecha;
    private String actividad;

    public Actividad(String fecha, String actividad) {
        this.fecha = fecha;
        this.actividad = actividad;
    }

    public void printInfo() {
        System.out.println("Actividad: " + fecha + " - " + actividad);
    }
}
