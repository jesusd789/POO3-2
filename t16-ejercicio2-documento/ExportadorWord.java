// Extensiones
class ExportadorWord implements Exportador {
    @Override
    public void exportar(String contenido) { System.out.println("Exportando a Word: " + contenido); }
}
