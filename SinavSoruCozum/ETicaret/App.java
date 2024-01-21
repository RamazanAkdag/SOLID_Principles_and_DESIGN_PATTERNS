package SinavSoruCozum.ETicaret;

public class App {
    public static void main(String[] args) {
        Veritabani veritabani = Veritabani.getInstance();
        Giris giris = new Giris();
        Satici satici = new Satici("Aras", "sefaaras@ktu.edu.tr", "123456",
                "Firma Adres");
        Musteri musteri = new Musteri("Hakan Bozkurt",
                "hakanbozkurt@ktu.edu.tr", "654321", "Ev Adres");
        veritabani.kullaniciKaydet(satici);
        veritabani.kullaniciKaydet(musteri);
        Urun bilgisayar = new Urun("Bilgisayar", 7500, satici);
        Urun telefon = new Urun("Telefon", 50000, satici);
        Urun tablet = new Urun("Tablet", 2000, satici);
        satici.kaydet(bilgisayar);
        satici.kaydet(telefon);
        satici.kaydet(tablet);
        satici.goruntule(bilgisayar);
        musteri.goruntule(telefon);
        if (giris.girisKontrol("sefa@ktu.edu.tr", "123456")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Giriş Başarısız");
        }
        if (giris.girisKontrol("sefaaras@ktu.edu.tr", "123456")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Giriş Başarısız");
        }
        musteri.urunEkle(tablet);
        musteri.urunEkle(bilgisayar);
        musteri.urunCikar(tablet);
        musteri.urunEkle(telefon);
        musteri.odemeYap();
    }

}
