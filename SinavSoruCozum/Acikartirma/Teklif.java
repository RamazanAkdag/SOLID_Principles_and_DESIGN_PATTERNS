package SinavSoruCozum.Acikartirma;

public class Teklif implements IVeri, Mailable {
    private Kullanici kullanici;
    private Urun urun;
    private double fiyat;

    public Teklif(Kullanici kullanici, Urun urun, double fiyat) {
        TeklifDB teklifDB = new TeklifDB();
        this.kullanici = kullanici;
        this.urun = urun;
        this.fiyat = fiyat;
        teklifDB.kaydet(this);
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public Urun getUrun() {
        return urun;
    }

    public void setUrun(Urun urun) {
        this.urun = urun;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

}
