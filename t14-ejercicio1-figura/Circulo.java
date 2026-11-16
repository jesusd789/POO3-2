class Circulo extends Figura {
    private final double radio;
    public Circulo(double radio) { this.radio = radio; }
    @Override
    public void calcularArea() {
        System.out.printf("Área del círculo (r=%.1f): %.2f%n", radio, Math.PI * radio * radio);
    }
}
