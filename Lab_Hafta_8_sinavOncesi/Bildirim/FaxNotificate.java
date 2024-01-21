package Lab_Hafta_8_sinavOncesi.Bildirim;

public class FaxNotificate implements Notificate {

    @Override
    public void send(InfoType infoType, String message) {
        if (infoType instanceof Fax) {
            System.out.println(((Fax) infoType).faxNo + " fax numarasına bildirim gönderiliyor : " + message);
        }
    }

}
