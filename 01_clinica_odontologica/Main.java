public class Main {
    public static void main(String[] args) {
        Clinica clinica = new Clinica("Sonrisa Feliz", "Neiva");
        Odontologo odontologo = new Odontologo("Laura", "Ortodoncia", "OD-01");
        clinica.agregarOdontologo(odontologo);

        Paciente paciente = new Paciente("Carlos", "123", "3000000000");
        paciente.crearTratamiento("Brackets", 1500000, "2026-03-07");
        Tratamiento tratamiento = paciente.getTratamiento(0);
        tratamiento.agregarSeccion("2026-03-10", "Valoracion");
        tratamiento.agregarSeccion("2026-03-20", "Instalacion");

        clinica.printInfo();
        odontologo.printInfo();
        paciente.printInfo();
        tratamiento.printInfo();
    }
}
