package Lab_Hafta_6_SingleRes_OpenClosed;

public class GirisIslemleri extends KullaniciIslemleri {

    public GirisIslemleri(Kullanici kullanici) {
        super(kullanici);

    }

    public void girisYap() {
        System.out.println(this.kullanici + "Giris yapti...");
    }
}
