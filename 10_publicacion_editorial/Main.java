public class Main {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Letras del Sur");
        Autor autor = new Autor("Gabriel Perez");
        Libro libro = new Libro("Java desde cero", "ISBN-001", "2026-01-20");

        libro.crearCapitulo("Introduccion", 20);
        autor.agregarLibro(libro);
        editorial.agregarAutor(autor);

        editorial.printInfo();
        autor.printInfo();
        libro.printInfo();
    }
}
