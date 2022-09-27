public class ContaPoupanca extends Conta {
  public ContaPoupanca() {}

  public ContaPoupanca(double saldoInicial) {
    super(saldoInicial);
  }

  @Override
  public void emitirExtrato() {
    System.out.println("Conta Poupança");
    super.emitirExtrato();
  }
}
