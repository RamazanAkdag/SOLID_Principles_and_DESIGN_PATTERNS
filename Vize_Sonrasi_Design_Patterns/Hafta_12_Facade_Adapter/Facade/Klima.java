package Facade;

public class Klima {
    private int sicaklik;

    public Klima() {
        sicaklik = 15;
    }

    public void guncelle(int deger) {
        this.setSicaklik(this.getSicaklik() + deger);
    }

    public void ac() {
        System.out.println("Klima acildi...");
    }

    public void kapat() {
        System.out.println("Klima kapandi...");
    }

    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
    }
}
