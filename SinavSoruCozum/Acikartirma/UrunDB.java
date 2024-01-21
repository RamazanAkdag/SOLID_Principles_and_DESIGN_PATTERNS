package SinavSoruCozum.Acikartirma;

import java.util.ArrayList;

public class UrunDB implements Veritabani {
    private static ArrayList<Urun> urunler;

    public UrunDB() {
        urunler = new ArrayList<>();
    }

    @Override
    public boolean kaydet(IVeri veri) {
        if (veri instanceof Urun) {
            urunler.add(((Urun) veri));
            return true;
        }

        return true;
    }

}
