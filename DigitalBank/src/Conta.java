public abstract class Conta implements IConta {
  private static final int AGENCIA_PADRAO = 1;
  private static int NUMERO_AUTO_INCREMENTADO = 1;

  protected int agencia = AGENCIA_PADRAO;
  protected int numero = NUMERO_AUTO_INCREMENTADO++;
  protected double saldo = 0;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.cliente = cliente;
  }

  public Conta(Cliente cliente, double saldoInicial) {
    this(cliente);
    saldo = saldoInicial;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void depositar(double valor) {
    saldo += valor;
  }

  public void sacar(double valor) {
    saldo -= valor;
  }

  public void transferir(double valor, IConta destino) {
    sacar(valor);
    destino.depositar(valor);
  }

  public void emitirExtrato() {
    System.out.println(
      String.format(
        "Titular = %s\n"
        + "Agência = %d\n"
        + "Número = %d\n"
        + "Saldo = $%.2f",
        cliente.getNome(),
        agencia,
        numero,
        saldo
      )
    );
    System.out.println("==============================");
  }
}
