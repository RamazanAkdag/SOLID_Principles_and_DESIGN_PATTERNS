package SinavSoruCozum.ETicaret;

import java.util.ArrayList;

public class Musteri extends Kullanici {
    Sepet sepet;

    public Musteri(String ad, String mail, String sifre, String adres) {
        super(ad, mail, sifre, adres);
        sepet = new Sepet();

    }

    @Override
    public void goruntule(Urun urun) {
        System.out.println(urun.getIsim() + " - " + urun.getFiyat());

    }

    public boolean urunEkle(Urun urun) {
        this.sepet.ekle(urun);
        return true;
    }

    public boolean urunCikar(Urun urun) {
        this.sepet.cikar(urun);
        return true;
    }

    public boolean odemeYap() {
        ArrayList<Urun> urunler = this.sepet.getUrunler();
        double toplam = 0;
        for (Urun urun : urunler) {
            toplam += urun.getFiyat();
        }
        Odeme odeme = new Odeme(toplam, this);
        System.out.println(this.getIsim() + " " + toplam + " tutarinda odeme yapti");
        Veritabani veritabani = Veritabani.getInstance();
        veritabani.odemeKaydet(odeme);
        return true;

    }

}
