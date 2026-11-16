public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.mover();
        v = new Coche();
        v.mover();
        v = new Bicicleta();
        v.mover();
    }
}
