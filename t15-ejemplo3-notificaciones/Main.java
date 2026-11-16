public class Main {
    public static void main(String[] args) {
        new EmailService().enviarEmail("ana@correo.com", "Hola");
        new SMSService().enviarSMS("3001234567", "Hola");
    }
}
