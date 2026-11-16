// ANTES: viola el SRP
class ProductoMonolitico {
    String nombre; double precio;
    ProductoMonolitico(String n, double p) { nombre = n; precio = p; }
    String generarEtiqueta() { return nombre + " - $" + precio; }
    double precioConIva() { return precio * 1.19; }
}
