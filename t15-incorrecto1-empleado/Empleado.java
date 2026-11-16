// VIOLA EL SRP: cálculo, informes y persistencia en una sola clase
class Empleado {
    private String nombre = "Ana";
    private double salario = 2000000;
    public double calcularSalarioMensual() { return salario * 12; }
    public void generarInforme() { System.out.println("Generando informe para: " + nombre); }
    public void guardarEnBaseDeDatos() { System.out.println("Guardando empleado en la base de datos..."); }
}
