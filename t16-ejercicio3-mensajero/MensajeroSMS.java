class MensajeroSMS extends Mensajero {
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("SMS a " + destino + ": " + mensaje);
    }
}
