package SinavSoruCozum.ETicaret;

public class Urun implements Kaydedilebilir {

    private String isim;
    private double fiyat;
    private Satici satici;

    public Urun(String isim, double fiyat, Satici satici) {
        this.isim = isim;
        this.fiyat = fiyat;
        this.satici = satici;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public Satici getSatici() {
        return satici;
    }

    public void setSatici(Satici satici) {
        this.satici = satici;
    }

}
