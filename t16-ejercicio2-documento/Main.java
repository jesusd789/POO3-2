public class Main {
    public static void main(String[] args) {
        GestorDocumentos gestor = new GestorDocumentos();
        String doc = "Informe de ventas";
        gestor.exportar(new ExportadorPDF(), doc);
        gestor.exportar(new ExportadorWord(), doc);
        gestor.exportar(new ExportadorExcel(), doc);
    }
}
