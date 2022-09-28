package digitalbank;

public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco("DIO Digital Bank");
        Cliente joao = new Cliente("João");
        Cliente maria = new Cliente("Maria");

        Conta mariaCC = new ContaCorrente(maria);
        Conta mariaCP = new ContaPoupanca(maria, 1000);
        Conta joaoCC = new ContaCorrente(joao, 500);
        Conta joaoCP = new ContaPoupanca(joao);

        banco.criarContas(new Conta[]{
            mariaCC, mariaCP,
            joaoCC, joaoCP
        });

        banco.getContas().forEach((__, conta) -> conta.emitirExtrato());

        banco.listarClientes();
    }
}
