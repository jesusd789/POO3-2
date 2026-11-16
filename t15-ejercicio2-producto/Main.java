public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Teclado mecánico", 100000);
        double total = new PrecioService().calcularPrecioConIva(p);
        System.out.println(new EtiquetaService().generarEtiqueta(p, total));
    }
}
