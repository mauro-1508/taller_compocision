public class Seccion {
    private String fecha;
    private String procedimiento;

    public Seccion(String fecha, String procedimiento) {
        this.fecha = fecha;
        this.procedimiento = procedimiento;
    }

    public void printInfo() {
        System.out.println("Seccion: " + fecha + " - " + procedimiento);
    }
}
