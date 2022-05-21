package exercicios;
public class ContaInvestimento extends Conta {
    private float taxaJuros;

    public ContaInvestimento(int numero, String nome, float saldo, float taxaJuros) {
        super(numero, nome, saldo);
        this.taxaJuros= taxaJuros;
    }

    public void adicioneJuros() {
        this.saldo += (this.saldo * this.taxaJuros/100);
    }

    @Override
    public String toString() {
        return "ContaInvestimento [taxaJuros="+ taxaJuros+ ", saldo="+ saldo+ "]";
    }

    public static void main(String[] args) {
        ContaInvestimento contaInvestimento = new ContaInvestimento(123, "Jose", 1000, 10);
        System.out.println(contaInvestimento);
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        contaInvestimento.adicioneJuros();
        System.out.println(contaInvestimento);
    }
}
