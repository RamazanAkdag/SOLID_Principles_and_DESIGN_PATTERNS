package SinavSoruCozum.ETicaret;

public class Odeme implements Kaydedilebilir {
    private double miktar;
    private Musteri musteri;

    public Odeme(double miktar, Musteri musteri) {
        this.miktar = miktar;
        this.musteri = musteri;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

}
