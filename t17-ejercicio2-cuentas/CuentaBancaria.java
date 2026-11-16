class CuentaBancaria {
    protected double saldo;
    public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("El monto debe ser positivo");
        saldo += monto;
    }
    public void retirar(double monto) {
        if (monto <= 0 || monto > saldo) throw new IllegalArgumentException("Monto inválido o saldo insuficiente");
        saldo -= monto;
    }
    public double getSaldo() { return saldo; }
}
