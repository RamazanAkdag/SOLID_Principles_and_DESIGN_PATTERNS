package Lab_Hafta_8_sinavOncesi.Bildirim.Bildirim2;

public class IpBildir implements IBildir {

    @Override
    public boolean bildir(Bildirim bildirim) {
        System.out.println(bildirim.kullanici.ip + " ip adresine gönderiliyor : " + bildirim.mesaj);
        return true;
    }

}
