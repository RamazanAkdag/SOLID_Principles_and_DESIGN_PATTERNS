package Lab_Hafta_8_sinavOncesi.Bildirim.Bildirim2;

public class App {
    public static void main(String[] args) {
        SendBildirim sendBildirim = new SendBildirim();

        Kullanici kullanici = new Kullanici("Ramazan", "akdagramazan586@gmail.com", "100.765.76.23", "5539330921");
        kullanici.addBildirimSecenek(new MailBildir());

        Kullanici kullanici2 = new Kullanici("Rozerin", "akdagroze@gmail.com", "800.537.62.00", "5539330921");
        kullanici2.addBildirimSecenek(new IpBildir());
        kullanici2.addBildirimSecenek(new MailBildir());

        sendBildirim.send(kullanici, "Selamun aleyküm gencooo");
        sendBildirim.send(kullanici2, "MErhabalar nasılsınız efenim");
    }

}
