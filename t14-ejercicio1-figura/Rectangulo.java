class Rectangulo extends Figura {
    private final double base, altura;
    public Rectangulo(double base, double altura) { this.base = base; this.altura = altura; }
    @Override
    public void calcularArea() {
        System.out.printf("Área del rectángulo (%.1f x %.1f): %.2f%n", base, altura, base * altura);
    }
}
