class LibroReporteService {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro: " + libro.getTitulo() + " - " + libro.getAutor());
    }
}
