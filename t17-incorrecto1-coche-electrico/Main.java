public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new CocheElectrico();
        try {
            miVehiculo.mover();
        } catch (UnsupportedOperationException e) {
            System.out.println("Excepción inesperada: " + e.getMessage());
        }
    }
}
