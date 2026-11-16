// VIOLA EL OCP: hay que modificar la clase por cada nuevo método de pago
class ProcesadorPago {
    public void realizarPago(String metodo, double monto) {
        if (metodo.equals("TarjetaCredito")) {
            System.out.println("Procesando pago con tarjeta de crédito: $" + monto);
        } else if (metodo.equals("PayPal")) {
            System.out.println("Procesando pago con PayPal: $" + monto);
        }
    }
}
