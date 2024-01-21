package SinavSoruCozum.Acikartirma;

public class Kullanici implements IVeri {
    private String isim;
    private String mail;

    public Kullanici(String isim, String mail) {
        KullaniciDB kullanicidb = new KullaniciDB();

        this.isim = isim;
        this.mail = mail;
        kullanicidb.kaydet(this);
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

}
