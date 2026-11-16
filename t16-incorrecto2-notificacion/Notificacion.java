// VIOLA EL OCP: hay que modificar la clase por cada nuevo canal
class Notificacion {
    public void enviar(String canal, String mensaje) {
        if (canal.equals("Email")) {
            System.out.println("Enviando email: " + mensaje);
        } else if (canal.equals("SMS")) {
            System.out.println("Enviando SMS: " + mensaje);
        }
    }
}
