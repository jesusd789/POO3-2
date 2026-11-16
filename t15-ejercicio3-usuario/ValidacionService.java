class ValidacionService {
    public boolean esValido(Usuario u) {
        return u.getNombre() != null && !u.getNombre().isBlank() && u.getContrasena().length() >= 8;
    }
}
