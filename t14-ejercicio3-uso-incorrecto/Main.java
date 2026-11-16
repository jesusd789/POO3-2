public class Main {
    public static void main(String[] args) {
        Animal animal = new Perro();
        animal.hacerSonido();
        // animal.correr(); // ERROR DE COMPILACIÓN: correr() no existe en Animal

        if (animal instanceof Perro p) { // solución: casting seguro
            p.correr();
        }

        Animal gato = new Gato();
        gato.hacerSonido(); // mismo resultado que Animal: sobrescritura inútil
    }
}
