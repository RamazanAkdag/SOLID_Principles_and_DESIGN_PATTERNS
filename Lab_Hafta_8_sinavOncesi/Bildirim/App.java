package Lab_Hafta_8_sinavOncesi.Bildirim;

public class App {

    public static void main(String[] args) {

        GsmNotificate gsmNotificate = new GsmNotificate();
        Gsm gsm = new Gsm();
        gsm.gsmNo = "55393390921";
        MainNotificator.sendNotification(gsmNotificate, gsm, "selamun aleyküm");

        MailNotificate mailNotificate = new MailNotificate();
        Mail mail = new Mail();
        mail.mail = "akdagramazan@gmail.com";
        MainNotificator.sendNotification(mailNotificate, mail, "Aleyküm selam");

        FaxNotificate faxNotificate = new FaxNotificate();
        Fax fax = new Fax();
        fax.faxNo = "556043";
        MainNotificator.sendNotification(faxNotificate, fax, "Kardeşim nabıyon");

    }
}
