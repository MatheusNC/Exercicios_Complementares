package exercicios;

public class Quadrado {
    private float tamanhoQuadrado;

    public void mudarValorLado(int valor) {
        this.tamanhoQuadrado = valor;
    }

    public float retornaValorLado() {
        return tamanhoQuadrado;
    }

    public float calcularArea() {
        return (tamanhoQuadrado * tamanhoQuadrado);
    }
}
