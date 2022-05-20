package exercicios;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public void envelhecer() {
        this.idade += 1;
        if (this.idade < 21) {
            crescer();
        }
    }

    public void engordar() {
        this.peso += 1;
    }

    public void emagrecer() {
        this.peso -= 1;
    }

    public void crescer() {
        this.altura += 0.5;
    }
}
