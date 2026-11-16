class PrecioService {
    private static final double IVA = 0.19;
    public double calcularPrecioConIva(Producto p) { return p.getPrecio() * (1 + IVA); }
}
