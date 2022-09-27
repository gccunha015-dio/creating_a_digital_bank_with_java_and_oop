public class ContaPoupanca extends Conta {
  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  public ContaPoupanca(Cliente cliente, double saldoInicial) {
    super(cliente, saldoInicial);
  }

  @Override
  public void emitirExtrato() {
    System.out.println("=== EXTRATO CONTA POUPANÇA ===");
    super.emitirExtrato();
  }
}
