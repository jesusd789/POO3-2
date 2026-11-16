public class Main {
    public static void main(String[] args) {
        Rectangulo r = new Cuadrado(2);
        r.setAncho(5);
        r.setAlto(2);
        System.out.println("Área esperada 10, obtenida: " + r.area());
    }
}
