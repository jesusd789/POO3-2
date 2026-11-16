public class Main {
    public static void main(String[] args) {
        Pedido p = new Pedido(200);
        System.out.println("Impuestos: " + new CalculoTotalService().calcularImpuestos(p));
        new EnvioService().enviarPedido(p);
    }
}
