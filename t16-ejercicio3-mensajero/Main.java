public class Main {
    public static void main(String[] args) {
        ServicioMensajeria servicio = new ServicioMensajeria();
        servicio.notificar(new MensajeroEmail(), "daniel@correo.com", "Bienvenido");
        servicio.notificar(new MensajeroSMS(), "3001234567", "Su código es 4821");
        servicio.notificar(new MensajeroPush(), "app-usuario-1", "Nueva actualización");
    }
}
