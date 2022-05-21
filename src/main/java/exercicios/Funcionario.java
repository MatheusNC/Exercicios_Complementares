package exercicios;

public class Funcionario {
    private String name;
    private float sair;

    public Funcionario(String name, float sair) {
        this.name= name;
        this.sair = sair;
    }

    public String getName() {
        return name;
    }

    public float getSalario() {
        return sair;
    }

    public void aumentarSalario(float porcentagemDeAumento) {
        this.sair += this.sair * (porcentagemDeAumento)/100;
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Douglas", 4100);
        System.out.println("Nome:"+ funcionario.getName() + ", Salário: "+ funcionario.getSalario());

        funcionario.aumentarSalario(52);
        System.out.println("Nome: "+ funcionario.getName() + ", Salário: "+ funcionario.getSalario());
    }
}
