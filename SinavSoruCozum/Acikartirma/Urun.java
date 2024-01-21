package SinavSoruCozum.Acikartirma;

import java.util.ArrayList;

public class Urun implements IVeri {

    private String isim;
    private double fiyat;

    public Urun(String isim, double fiyat) {
        UrunDB urunDB = new UrunDB();
        this.isim = isim;
        this.fiyat = fiyat;
        urunDB.kaydet(this);
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

    public void teklifVer(Kullanici kullanici, double fiyat) {
        Teklif teklif = new Teklif(kullanici, this, fiyat);
        ArrayList<Teklif> teklifdb = TeklifDB.getTeklifler();

        for (Teklif teklif1 : teklifdb) {
            if (teklif1.getUrun().getIsim().equals(this.getIsim())
                    && !teklif.getKullanici().getIsim().equals(kullanici.getIsim())) {

                GmailTeklif gmailTeklif = new GmailTeklif();
                gmailTeklif.mailGonder(teklif);
            }

        }

    }

}
