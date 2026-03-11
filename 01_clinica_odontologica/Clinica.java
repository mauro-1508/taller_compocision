import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private String nombre;
    private String lugar;
    private List<Odontologo> odontologos;

    public Clinica(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.odontologos = new ArrayList<>();
    }

    // Agregación: el odontólogo existe fuera de la clínica y luego se agrega.
    public void agregarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    public void printInfo() {
        System.out.println("Clinica: " + nombre + " - Lugar: " + lugar);
        System.out.println("Odontologos registrados: " + odontologos.size());
    }
}
