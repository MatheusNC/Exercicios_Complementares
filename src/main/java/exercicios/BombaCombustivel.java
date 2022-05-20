package exercicios;

public class BombaCombustivel {
    private String tipoCombustivel;
    private float valorLitro;
    private float quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(float valor){
        float qtdLitros;
        qtdLitros = valor / this.valorLitro;
        this.quantidadeCombustivel -= qtdLitros;

        System.out.println("Abasteceu " + qtdLitros + " litros de " + this.tipoCombustivel);
    }

    public void abastecerPorLitro(float litro) {
        float valorPago;
        valorPago = valorLitro * litro;
        this.quantidadeCombustivel -= litro;

        System.out.println("Valor a ser pago: R$ " + valorPago + " reais");
    }

    public void alterarValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void alterarTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void alterarQuantidadeCombustivel(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
}
