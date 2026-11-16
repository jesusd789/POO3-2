class EtiquetaService {
    public String generarEtiqueta(Producto p, double precioFinal) {
        return String.format("[%s] Precio final: $%.2f", p.getNombre(), precioFinal);
    }
}
