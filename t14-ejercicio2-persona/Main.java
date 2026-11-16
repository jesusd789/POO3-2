public class Main {
    public static void main(String[] args) {
        Persona[] personas = {
            new Persona("Carlos"),
            new Estudiante("Ana", "Ingeniería de Software"),
            new Profesor("John Arrieta", "Programación Orientada a Objetos")
        };
        for (Persona p : personas) p.presentarse();
    }
}
