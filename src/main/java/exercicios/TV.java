package exercicios;

public class TV {
    private int canal;
    private int volume;

    public TV(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        if (this.volume < 100)
            this.volume += 1;
        else
            System.out.println("Não é possível aumentar o volume");
    }

    public void diminuirVolume() {
        if (this.volume > 0)
            this.volume -= 1;
        else
            System.out.println("Não é possível diminuir o volume");
    }

    public static void main(String[] args) {
        TV tv = new TV(5, 60);

        tv.diminuirVolume();
        tv.mudarCanal(7);
        System.out.println("Volume da TV: " + tv.getVolume());
        System.out.println("Canal: " + tv.getCanal());
    }
}
