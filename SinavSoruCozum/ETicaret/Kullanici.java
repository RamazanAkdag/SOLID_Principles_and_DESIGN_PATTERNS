package SinavSoruCozum.ETicaret;

public abstract class Kullanici {
    protected String isim;
    protected String mail;
    protected String sifre;
    protected String adres;

    public Kullanici(String isim, String mail, String sifre, String adres) {
        this.isim = isim;
        this.mail = mail;
        this.sifre = sifre;
        this.adres = adres;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public abstract void goruntule(Urun urun);

}
