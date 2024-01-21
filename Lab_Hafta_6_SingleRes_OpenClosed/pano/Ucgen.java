package Lab_Hafta_6_SingleRes_OpenClosed.pano;

public class Ucgen implements Sekil {
    private double kenar1;
    private double kenar2;
    private double tabanKenar3;
    private double yukseklik;

    public Ucgen(double kenar1, double kenar2, double tabanKenar3, double yukseklik) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.tabanKenar3 = tabanKenar3;
        this.yukseklik = yukseklik;
    }

    @Override
    public double alanHesapla() {
        double alan = (tabanKenar3 * yukseklik) / 2;
        System.out.println("ucgen alani = " + alan);
        return alan;
    }

    @Override
    public double cevreHesapla() {
        double cevre = kenar1 + kenar2 + tabanKenar3;
        System.out.println("ucgen cevresi = " + cevre);
        return cevre;
    }

}
