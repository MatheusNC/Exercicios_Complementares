package exercicios;

import java.util.ArrayList;

public class Macaco {
    private String nome;
    private ArrayList<String> bucho = new ArrayList<>();

    public Macaco(String nome) {
        this.nome = nome;
    }

    public void comer(String comida) {
        this.bucho.add(comida);
    }

    public void verBucho() {
        for (String comida: bucho) {
            System.out.println("Bucho: " + comida);
        }
        System.out.println("-================-");
    }

    public void digerir() {
        if (!bucho.isEmpty()) {
            bucho.remove(bucho.size() - 1);
        }
    }

    public static void main(String[] args) {
        Macaco macaco = new Macaco("Gustavo");

        macaco.comer("Banana");
        macaco.comer("Berinjela");
        macaco.verBucho();
        macaco.digerir();
        macaco.verBucho();
    }
}
