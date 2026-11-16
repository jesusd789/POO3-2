class MensajeroPush extends Mensajero {
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Push a " + destino + ": " + mensaje);
    }
}
