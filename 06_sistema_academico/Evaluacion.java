public class Evaluacion {
    private String fecha;
    private int porcentaje;

    public Evaluacion(String fecha, int porcentaje) {
        this.fecha = fecha;
        this.porcentaje = porcentaje;
    }

    public void printInfo() {
        System.out.println("Evaluacion: " + fecha + " - " + porcentaje + "%");
    }
}
