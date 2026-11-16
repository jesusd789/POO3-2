// MALA PRÁCTICA: sobrescribe solo para llamar a super sin cambiar nada
class Moto extends Vehiculo {
    @Override
    public void mover() { super.mover(); }
}
