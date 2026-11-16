public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("Clean Code", "Robert C. Martin");
        new LibroReporteService().generarReporte(libro);
        new LibroRepositorio().guardar(libro);
    }
}
