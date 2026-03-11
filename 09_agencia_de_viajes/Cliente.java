public class Cliente {
    private String nombre;
    private String beneficios;

    public Cliente(String nombre, String beneficios) {
        this.nombre = nombre;
        this.beneficios = beneficios;
    }

    public void printInfo() {
        System.out.println("Cliente: " + nombre + " - Beneficios: " + beneficios);
    }
}
