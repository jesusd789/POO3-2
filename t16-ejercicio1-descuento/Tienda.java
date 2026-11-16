class Tienda {
    public double calcularPrecioFinal(double precio, Descuento descuento) {
        return descuento.aplicar(precio);
    }
}
