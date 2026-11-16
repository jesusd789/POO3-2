class Rectangulo extends Forma {
    private double ancho, alto;
    public Rectangulo(double ancho, double alto) { this.ancho = ancho; this.alto = alto; }
    public void setAncho(double ancho) { this.ancho = ancho; }
    public void setAlto(double alto) { this.alto = alto; }
    @Override
    public double area() { return ancho * alto; }
}
