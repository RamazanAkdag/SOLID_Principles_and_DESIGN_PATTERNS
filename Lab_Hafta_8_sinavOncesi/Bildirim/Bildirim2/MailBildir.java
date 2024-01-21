package Lab_Hafta_8_sinavOncesi.Bildirim.Bildirim2;

public class MailBildir implements IBildir {

    @Override
    public boolean bildir(Bildirim bildirim) {
        System.out.println(bildirim.kullanici.mail + " mail adresine bildirim gonderiliyor : " + bildirim.mesaj);
        return true;
    }

}
