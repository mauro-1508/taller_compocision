public class Actividad {
    private String horaInicio;
    private int duracion;
    private String responsable;

    public Actividad(String horaInicio, int duracion, String responsable) {
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.responsable = responsable;
    }

    public void printInfo() {
        System.out.println("Actividad: " + horaInicio + " - " + duracion + " min - Responsable: " + responsable);
    }
}
