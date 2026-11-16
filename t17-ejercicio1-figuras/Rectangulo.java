class Rectangulo extends Figura {
    private final double ancho, alto;
    public Rectangulo(double ancho, double alto) { this.ancho = ancho; this.alto = alto; }
    @Override
    public double area() { return ancho * alto; }
}
