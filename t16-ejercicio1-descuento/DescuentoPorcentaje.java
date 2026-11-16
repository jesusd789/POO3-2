class DescuentoPorcentaje extends Descuento {
    private final double porcentaje;
    public DescuentoPorcentaje(double porcentaje) { this.porcentaje = porcentaje; }
    @Override
    public double aplicar(double precio) { return precio - precio * porcentaje / 100; }
}
