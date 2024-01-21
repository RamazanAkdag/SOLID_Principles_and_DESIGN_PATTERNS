package Lab_Hafta_8_sinavOncesi.Bildirim.Bildirim2;

public class SendBildirim {
    public boolean send(AbstractKullanici kullanici, String mesaj) {
        for (IBildir bildirim : kullanici.bildirimSecenek) {
            bildirim.bildir(new Bildirim(kullanici, mesaj));

        }
        return true;
    }
}
