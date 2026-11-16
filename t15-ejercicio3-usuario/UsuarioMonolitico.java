// ANTES: viola el SRP
class UsuarioMonolitico {
    String nombre, contrasena;
    boolean validar() { return !nombre.isBlank() && contrasena.length() >= 8; }
    boolean autenticar(String c) { return contrasena.equals(c); }
}
