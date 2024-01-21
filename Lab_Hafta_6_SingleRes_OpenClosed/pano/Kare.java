package Lab_Hafta_6_SingleRes_OpenClosed.pano;

public class Kare implements Sekil {
    public int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        double alan = kenar * kenar;
        System.out.println("karenin alanı = " + alan);

        return alan;

    }

    @Override
    public double cevreHesapla() {
        double cevre = kenar * 4;
        System.out.println("karenin cevresi = " + cevre);
        return cevre;

    }

}
