public class Main {
    public static void main(String[] args) {
        ProcesadorPago p = new ProcesadorPago();
        p.realizarPago("TarjetaCredito", 100);
        p.realizarPago("PayPal", 50);
    }
}
