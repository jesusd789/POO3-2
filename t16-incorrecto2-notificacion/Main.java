public class Main {
    public static void main(String[] args) {
        Notificacion n = new Notificacion();
        n.enviar("Email", "Hola");
        n.enviar("SMS", "Hola");
    }
}
