import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private String isbn;
    private String fechaPublicacion;
    private List<Capitulo> capitulos;

    public Libro(String titulo, String isbn, String fechaPublicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.fechaPublicacion = fechaPublicacion;
        this.capitulos = new ArrayList<>();
    }

    // Composición: los capítulos pertenecen al libro.
    public void crearCapitulo(String titulo, int paginas) {
        capitulos.add(new Capitulo(titulo, paginas));
    }

    public void printInfo() {
        System.out.println("Libro: " + titulo + " - ISBN: " + isbn + " - Capitulos: " + capitulos.size());
    }
}
