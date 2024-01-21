package Facade;

public class Televizyon {
    public int sesSeviye;
    public int kanalNumara;

    public Televizyon() {
        sesSeviye = 0;
        kanalNumara = 1;

    }

    public void ac() {
        System.out.println("Televizyon acildi");
    }

    public void kapat() {
        System.out.println("Televizyon Kapandi");
    }

    public void sesAzalt() {
        sesSeviye--;
    }

    public void sesArtir() {
        sesSeviye++;
    }

    public void kanalAzalt() {
        kanalNumara--;
    }

}
