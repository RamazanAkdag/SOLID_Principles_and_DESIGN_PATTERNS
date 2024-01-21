package SinavSoruCozum.ETicaret;

import java.util.ArrayList;

public class Sepet {
    private ArrayList<Urun> urunler;

    public Sepet() {
        urunler = new ArrayList<>();
    }

    public boolean ekle(Urun urun) {
        urunler.add(urun);
        return true;
    }

    public boolean cikar(Urun urun) {
        urunler.remove(urun);
        return true;
    }

    public ArrayList<Urun> getUrunler() {
        return urunler;
    }
}
