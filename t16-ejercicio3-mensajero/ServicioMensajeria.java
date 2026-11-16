class ServicioMensajeria {
    public void notificar(Mensajero canal, String destino, String mensaje) {
        canal.enviar(destino, mensaje);
    }
}
