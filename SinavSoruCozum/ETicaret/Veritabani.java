package SinavSoruCozum.ETicaret;

public class Veritabani {
    Giris giris = new Giris();

    public static Veritabani getInstance() {
        return new Veritabani();
    }

    public void kullaniciKaydet(Kullanici kullanici) {
        giris.kullanicilar.add(kullanici);
        System.out.println(kullanici.isim + " sisteme kaydedilmistir...");
    }

    public void UrunKaydet(Urun urun) {
        System.out.println(urun.getIsim() + " sisteme kaydedilmistir...");
    }

    public void odemeKaydet(Odeme odeme) {
        System.out.println(odeme.getMusteri().getIsim() + " " + odeme.getMiktar()
                + " tutarinda odemesi sisteme kaydedilmistir...");
    }
}
