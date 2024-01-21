package Lab_Hafta_8_sinavOncesi.Bildirim;

public class IpNotificate implements Notificate {

    @Override
    public void send(InfoType infoType, String message) {
        if (infoType instanceof Ip) {
            System.out.println(((Ip) infoType).ip + " ip adresine gönderiliyor : " + message);
        }
    }

}
