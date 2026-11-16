public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        System.out.println("Con 20 %: " + tienda.calcularPrecioFinal(50000, new DescuentoPorcentaje(20)));
        System.out.println("Con $5000 fijos: " + tienda.calcularPrecioFinal(50000, new DescuentoFijo(5000)));
    }
}
