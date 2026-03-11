public class Trabajo {
    private String problema;
    private double costo;

    public Trabajo(String problema, double costo) {
        this.problema = problema;
        this.costo = costo;
    }

    public void printInfo() {
        System.out.println("Trabajo: " + problema + " - Costo: " + costo);
    }
}
