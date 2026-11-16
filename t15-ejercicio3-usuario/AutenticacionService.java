class AutenticacionService {
    public boolean autenticar(Usuario registrado, String contrasenaIngresada) {
        return registrado.getContrasena().equals(contrasenaIngresada);
    }
}
