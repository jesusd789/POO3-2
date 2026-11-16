// VIOLA EL LSP: lanza una excepción que la clase base no prevé
class CocheElectrico extends Vehiculo {
    @Override
    public void mover() { throw new UnsupportedOperationException("Coche eléctrico necesita recarga."); }
}
