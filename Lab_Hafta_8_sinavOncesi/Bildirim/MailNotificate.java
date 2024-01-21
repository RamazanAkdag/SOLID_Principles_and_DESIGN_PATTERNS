package Lab_Hafta_8_sinavOncesi.Bildirim;

public class MailNotificate implements Notificate {

    @Override
    public void send(InfoType infoType, String message) {
        if (infoType instanceof Mail) {
            System.out.println(((Mail) infoType).mail + " mail adresine gönderiliyor : " + message);
        }
    }

}
