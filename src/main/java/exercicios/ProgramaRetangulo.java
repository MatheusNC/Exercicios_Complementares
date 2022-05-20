package exercicios;

import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("-= Programa dos retangulo =-");
        System.out.println("Informe as medidas do local: ");
        System.out.println("Largura -> ");
        float largura = sc.nextFloat();
        System.out.println("Comprimento -> ");
        float comprimento = sc.nextFloat();

        retangulo.mudarValores(largura, comprimento);

        System.out.println("A quantidade de pisos em m² é: " + retangulo.calcularArea());
        System.out.println("A quantidade de rodapés em metros é: " + retangulo.calcularPerimetro());
    }
}
