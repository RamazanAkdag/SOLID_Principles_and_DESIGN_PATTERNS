package SinavSoruCozum.ETicaret;

import java.util.ArrayList;

public class Giris {

    static ArrayList<Kullanici> kullanicilar;

    public Giris() {
        kullanicilar = new ArrayList<>();
    }

    boolean girisKontrol(String mail, String sifre) {

        for (Kullanici kullanici : kullanicilar) {
            if (kullanici.getMail().equals(mail) && kullanici.getSifre().equals(sifre)) {

                return true;
            }
        }

        return false;
    }

}
