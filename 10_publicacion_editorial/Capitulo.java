public class Capitulo {
    private String titulo;
    private int paginas;

    public Capitulo(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public void printInfo() {
        System.out.println("Capitulo: " + titulo + " - Paginas: " + paginas);
    }
}
