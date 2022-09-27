public class ContaCorrente extends Conta {
  public ContaCorrente() {}

  public ContaCorrente(double saldoInicial) {
    super(saldoInicial);
  }

  @Override
  public void emitirExtrato() {
    System.out.println("Conta Corrente");
    super.emitirExtrato();
  }
}
