// MALA PRÁCTICA: la sobrescritura no cambia nada respecto a la clase base
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        super.hacerSonido();
    }
}
