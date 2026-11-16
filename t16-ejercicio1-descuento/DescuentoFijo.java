// Extensión: se agrega sin tocar el código existente
class DescuentoFijo extends Descuento {
    private final double valor;
    public DescuentoFijo(double valor) { this.valor = valor; }
    @Override
    public double aplicar(double precio) { return Math.max(0, precio - valor); }
}
