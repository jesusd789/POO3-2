public class Main {
    static void operar(CuentaBancaria cuenta) {
        cuenta.depositar(1000);
        cuenta.retirar(300);
        System.out.println("Saldo: " + cuenta.getSaldo());
    }

    public static void main(String[] args) {
        operar(new CuentaBancaria());
        operar(new CuentaAhorros(0.02)); // sustitución válida
    }
}
