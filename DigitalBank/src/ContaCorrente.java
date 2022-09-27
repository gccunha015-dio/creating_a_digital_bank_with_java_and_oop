public class ContaCorrente extends Conta {
  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  public ContaCorrente(Cliente cliente, double saldoInicial) {
    super(cliente, saldoInicial);
  }

  @Override
  public void emitirExtrato() {
    System.out.println("=== EXTRATO CONTA CORRENTE ===");
    super.emitirExtrato();
  }
}
