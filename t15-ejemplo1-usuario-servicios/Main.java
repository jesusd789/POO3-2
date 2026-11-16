public class Main {
    public static void main(String[] args) {
        Usuario u = new Usuario("admin", "1234");
        System.out.println("Autenticado: " + new AutenticacionService().autenticar(u, "1234"));
        new InformeService().generarInformeUsuario(u);
    }
}
