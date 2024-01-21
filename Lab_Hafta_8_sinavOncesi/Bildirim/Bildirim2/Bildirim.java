package Lab_Hafta_8_sinavOncesi.Bildirim.Bildirim2;

public class Bildirim {

    AbstractKullanici kullanici;
    String mesaj;

    public Bildirim(AbstractKullanici kullanici, String mesaj) {
        this.kullanici = kullanici;
        this.mesaj = mesaj;
    }
}
