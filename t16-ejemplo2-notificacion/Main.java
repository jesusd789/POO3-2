public class Main {
    public static void main(String[] args) {
        GestorNotificacion g = new GestorNotificacion();
        g.notificar(new NotificacionEmail(), "Hola");
        g.notificar(new NotificacionSMS(), "Hola");
    }
}
