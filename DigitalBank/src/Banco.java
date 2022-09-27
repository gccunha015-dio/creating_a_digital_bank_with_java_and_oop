import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Banco {
  private String nome;
  private Map<String, Conta> contas = new TreeMap<>();

  public Banco(String nome) {
    this.nome = nome;
  }

  public void criarContas(Conta[] contas) {
    for (var conta : contas) {
      this.contas.put(
        String.format(
          "%04d-%02d [%s]",
          conta.getAgencia(),
          conta.getNumero(),
          conta.getCliente().getNome()
        ),
        conta
      );
    }
  }

  public String getNome() {
    return nome;
  }

  public Map<String, Conta> getContas() {
    return contas;
  }

  public void listarClientes() {
    System.out.println("========== CLIENTES ==========");
    _getClientes().forEach((cliente) -> System.out.println(
      " " + cliente.getNome()
    ));
    System.out.println("==============================");
  }

  private TreeSet<Cliente> _getClientes() {
    var clientes = new TreeSet<Cliente>(
      (c1, c2) -> c1.getNome().compareToIgnoreCase(c2.getNome())
    );
    contas.forEach((__, conta) -> clientes.add(conta.getCliente()));
    return clientes;
  }
}
