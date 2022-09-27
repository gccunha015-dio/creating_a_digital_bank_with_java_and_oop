public abstract class Conta implements IConta {
  protected double saldo = 0;

  public Conta() {}

  public Conta(double saldoInicial) {
    this.saldo = saldoInicial;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public void transferir(double valor, IConta destino) {
    this.sacar(valor);
    this.depositar(valor);
  }

  public void emitirExtrato() {
    System.out.println(
      String.format(
        "Saldo = $%.2f\n",
        this.saldo)
    );
  }
}
