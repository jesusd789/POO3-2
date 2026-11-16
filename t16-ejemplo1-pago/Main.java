public class Main {
    public static void main(String[] args) {
        ProcesadorPago p = new ProcesadorPago();
        p.realizarPago(new TarjetaCredito(), 100);
        p.realizarPago(new PayPal(), 50);
    }
}
