package Lab_Hafta_8_sinavOncesi.Bildirim;

public class MainNotificator {
    public static void sendNotification(Notificate notificate, InfoType infoType, String message) {
        notificate.send(infoType, message);
    }
}
