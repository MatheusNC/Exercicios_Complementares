package exercicios;

public class Retangulo {
    private float base;
    private float altura;
    private Ponto ponto1;
    private Ponto ponto2;

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public Ponto getPonto1() {
        return ponto1;
    }

    public void setPonto1(Ponto ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto getPonto2() {
        return ponto2;
    }

    public void setPonto2(Ponto ponto2) {
        this.ponto2 = ponto2;
    }

    public void mudarValores(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public String mostrarValores() {
        return base + " | " + altura;
    }

    public float calcularArea() {
        return base * altura;
    }

    public float calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public Ponto acharCentro() {
        Ponto ponto = new Ponto((this.base/2), (this.altura/2));
        return ponto;
    }
}
