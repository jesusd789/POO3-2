class CuentaAhorros extends CuentaBancaria {
    private final double tasa;
    public CuentaAhorros(double tasa) { this.tasa = tasa; }
    public void aplicarInteres() { saldo += saldo * tasa; } // extensión, no altera el contrato
}
