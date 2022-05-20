package exercicios;

public class Carro {
    private float consumoCombustivel;
    private float quantidadeCombustivel;

    public Carro(float consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.quantidadeCombustivel = 0;
    }

    public void andar(float distanciaKm) {
        this.quantidadeCombustivel -= (distanciaKm / this.consumoCombustivel);
    }

    public void obterGasolina() {
        System.out.println("Nível de combustível: " + this.quantidadeCombustivel + " litros");
    }

    public void adicionarGasolina(float quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro(10);

        meuCarro.adicionarGasolina(30);
        meuCarro.andar(250);
        meuCarro.obterGasolina();
    }
}
