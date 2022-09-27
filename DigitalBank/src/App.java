public class App {
    public static void main(String[] args) throws Exception {
       Conta c1 = new ContaCorrente();
       Conta c2 = new ContaPoupanca(100);

       c1.emitirExtrato();
       c2.emitirExtrato();
    }
}
