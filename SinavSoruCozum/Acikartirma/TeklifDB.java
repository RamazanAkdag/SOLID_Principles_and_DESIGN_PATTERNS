package SinavSoruCozum.Acikartirma;

import java.util.ArrayList;

public class TeklifDB implements Veritabani {
    private static ArrayList<Teklif> teklifler;

    public TeklifDB() {
        teklifler = new ArrayList<>();
    }

    @Override
    public boolean kaydet(IVeri veri) {
        if (veri instanceof TeklifDB) {
            teklifler.add((Teklif) veri);
            return true;
        }
        return false;
    }

    public static ArrayList<Teklif> getTeklifler() {
        return teklifler;
    }

}
