public class Main {
    static double sumarAreas(Figura[] figuras) {
        double total = 0;
        for (Figura f : figuras) total += f.area();
        return total;
    }

    public static void main(String[] args) {
        Figura[] figuras = { new Circulo(2), new Rectangulo(3, 4) };
        System.out.printf("Área total: %.2f%n", sumarAreas(figuras));
    }
}
