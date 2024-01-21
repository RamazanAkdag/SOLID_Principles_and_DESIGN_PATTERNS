package SinavSoruCozum.ETicaret;

public class Satici extends Kullanici {

    public Satici(String ad, String mail, String sifre, String adres) {
        super(ad, mail, sifre, adres);

    }

    @Override
    public void goruntule(Urun urun) {
        System.out.println(urun.getIsim() + " - " + urun.getFiyat() + " - " + urun.getSatici().getIsim() + " - "
                + urun.getSatici().getAdres());
    }

    public boolean kaydet(Urun urun) {

        return true;

    }

}
