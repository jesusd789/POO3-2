public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = { new Vehiculo(), new Coche(), new Bicicleta() };
        for (Vehiculo v : vehiculos) v.mover();
    }
}
