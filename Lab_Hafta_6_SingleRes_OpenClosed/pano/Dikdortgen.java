package Lab_Hafta_6_SingleRes_OpenClosed.pano;

public class Dikdortgen implements Sekil {
    private double kisaKenar;
    private double uzunKenar;

    public Dikdortgen(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }

    @Override
    public double alanHesapla() {
        double alan = kisaKenar * uzunKenar;
        System.out.println("dikdörtgen alani = " + alan);
        return alan;
    }

    @Override
    public double cevreHesapla() {
        double cevre = (kisaKenar + uzunKenar) * 2;
        System.out.println("dikdörtgen cevresi = " + cevre);
        return cevre;
    }

}
