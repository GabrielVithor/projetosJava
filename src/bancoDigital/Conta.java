package bancoDigital;

import java.math.BigDecimal;
public abstract class Conta implements IConta {
    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Cliente: %s",cliente.getNome()));
        System.out.println(String.format("Agencia: %d",agencia));
        System.out.println(String.format("Numero: %d",numero));
        System.out.println(String.format("Saldo: %.2f",saldo));
    }
}
