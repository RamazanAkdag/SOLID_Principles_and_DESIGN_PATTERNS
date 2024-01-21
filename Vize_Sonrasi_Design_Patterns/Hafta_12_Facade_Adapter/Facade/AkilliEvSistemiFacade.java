package Facade;

public class AkilliEvSistemiFacade {
    private Klima klima;
    private Kapi kapi;
    private Isik isik;
    private Televizyon televizyon;

    public AkilliEvSistemiFacade() {
        this.klima = new Klima();
        this.kapi = new Kapi();
        this.isik = new Isik();
        this.televizyon = new Televizyon();
    }

    // Klima işlemleri
    public void klimayiAc() {
        klima.ac();
    }

    public void klimayiKapat() {
        klima.kapat();
    }

    public void klimaSicaklikArtir(int deger) {
        klima.guncelle(deger);
    }

    // Kapı işlemleri
    public void kapiyiKilitle() {
        kapi.kilitle();
    }

    public void kapiyiAc() {
        kapi.kilitAc();
    }

    // Işık işlemleri
    public void isigiAc() {
        isik.ac();
    }

    public void isigiKapat() {
        isik.kapat();
    }

    // Televizyon işlemleri
    public void televizyonuAc() {
        televizyon.ac();
    }

    public void televizyonuKapat() {
        televizyon.kapat();
    }

    public void televizyonSesAzalt() {
        televizyon.sesAzalt();
    }

    public void televizyonSesArtir() {
        televizyon.sesArtir();
    }

    public void televizyonKanalAzalt() {
        televizyon.kanalAzalt();
    }

    public void televizyonSinemaModu() {
        televizyon.ac();
        televizyon.sesArtir();
        System.out.println("Televizyon sinema modu aktif");
    }

    public void televizyonUykuModu() {
        televizyon.sesAzalt();
        System.out.println("Televizyon uyku modu");
    }

}