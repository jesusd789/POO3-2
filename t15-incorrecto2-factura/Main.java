public class Main {
    public static void main(String[] args) {
        Factura f = new Factura();
        System.out.println(f.calcularImpuestos());
        f.imprimirFactura();
        f.guardarFactura();
    }
}
