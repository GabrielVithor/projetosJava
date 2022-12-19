package bancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gabriel");
        Conta contaC = new ContaCorrente(cliente);
        Conta contaP = new ContaPoupanca(cliente);

        contaC.depositar(100);
        contaC.transferir(contaP,100);

        contaC.imprimirExtrato();
        contaP.imprimirExtrato();
    }
}
