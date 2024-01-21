package Lab_Hafta_8_sinavOncesi.Bildirim;

public class GsmNotificate implements Notificate {

    @Override
    public void send(InfoType infoType, String message) {
        if (infoType instanceof Gsm) {
            System.out.println(((Gsm) infoType).gsmNo + " telefon numarasına gönderiliyor : " + message);
        }
    }

}
