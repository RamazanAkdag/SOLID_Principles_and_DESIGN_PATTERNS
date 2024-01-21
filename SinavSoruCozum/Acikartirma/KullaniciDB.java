package SinavSoruCozum.Acikartirma;

import java.util.ArrayList;

public class KullaniciDB implements Veritabani {
    private static ArrayList<Kullanici> kullanicilar;

    public KullaniciDB() {
        kullanicilar = new ArrayList<>();
    }

    @Override
    public boolean kaydet(IVeri veri) {
        if (veri instanceof Kullanici) {
            kullanicilar.add(((Kullanici) veri));
            return true;
        }

        return false;
    }

}
