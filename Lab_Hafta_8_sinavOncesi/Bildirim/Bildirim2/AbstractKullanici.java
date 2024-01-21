package Lab_Hafta_8_sinavOncesi.Bildirim.Bildirim2;

import java.util.ArrayList;

public abstract class AbstractKullanici {
    public String isim;
    public String mail;
    public String ip;
    public String tel;
    ArrayList<IBildir> bildirimSecenek;

    public AbstractKullanici(String isim, String mail, String ip, String tel) {
        this.isim = isim;
        this.mail = mail;
        this.ip = ip;
        this.tel = tel;
        bildirimSecenek = new ArrayList<>();

    }

    void addBildirimSecenek(IBildir bildirim) {
        bildirimSecenek.add(bildirim);
    }

}
