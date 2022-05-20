package exercicios;

public class ContaCorrente {
    private int numConta;
    private String nome;
    private double saldo;

    public ContaCorrente(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }
}
