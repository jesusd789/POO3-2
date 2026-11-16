public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("daniel", "segura1234");
        ValidacionService validacion = new ValidacionService();
        AutenticacionService auth = new AutenticacionService();
        System.out.println("¿Usuario válido? " + validacion.esValido(u));
        System.out.println("¿Credenciales correctas? " + auth.autenticar(u, "segura1234"));
        System.out.println("¿Credenciales incorrectas? " + auth.autenticar(u, "otra"));
    }
}
