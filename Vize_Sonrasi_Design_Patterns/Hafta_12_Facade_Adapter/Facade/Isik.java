package Facade;

public class Isik {
    boolean durum;

    public Isik() {

    }

    public void ac() {
        durum = true;
        System.out.println("Isik acildi");
    }

    public void kapat() {
        durum = false;
        System.out.println("Isik kapandi");
    }

}
