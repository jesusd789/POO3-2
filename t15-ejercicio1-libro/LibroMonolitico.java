// ANTES: viola el SRP (datos + reportes + persistencia)
class LibroMonolitico {
    private String titulo, autor;
    public LibroMonolitico(String t, String a) { titulo = t; autor = a; }
    public void generarReporte() { System.out.println("Reporte: " + titulo + " - " + autor); }
    public void guardar() { System.out.println("Guardando " + titulo + " en la base de datos..."); }
}
