package bancoDigital;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("====Extrato conta poupança ====");
        imprimirInfosComuns();
    }
}
