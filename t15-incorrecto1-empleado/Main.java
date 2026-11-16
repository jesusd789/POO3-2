public class Main {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        System.out.println(e.calcularSalarioMensual());
        e.generarInforme();
        e.guardarEnBaseDeDatos();
    }
}
