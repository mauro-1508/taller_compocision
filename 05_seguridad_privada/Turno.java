public class Turno {
    private String horaInicio;
    private String horaFin;

    public Turno(String horaInicio, String horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void printInfo() {
        System.out.println("Turno: " + horaInicio + " a " + horaFin);
    }
}
