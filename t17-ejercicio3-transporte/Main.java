public class Main {
    static void iniciarViaje(Transporte t) { t.mover(); }

    public static void main(String[] args) {
        iniciarViaje(new Bicicleta());
        iniciarViaje(new Coche());
    }
}
