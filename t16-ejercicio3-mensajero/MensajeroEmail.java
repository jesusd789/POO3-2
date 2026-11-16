class MensajeroEmail extends Mensajero {
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Email a " + destino + ": " + mensaje);
    }
}
