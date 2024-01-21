package Lab_Hafta_6_SingleRes_OpenClosed.panoTekrar;

import java.util.ArrayList;

public interface Sekil {

}

interface Alan extends Sekil {
    public double alanHesapla();
}

interface Cevre extends Sekil {
    public double cevreHesapla();
}

class Cember implements Cevre, Sekil {
    private double r;

    public Cember(double r) {
        this.r = r;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (Math.PI) * r;
    }

}

class Kare implements Alan, Cevre, Sekil {
    private int kenar;

    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public double cevreHesapla() {
        return kenar * 4;
    }

    @Override
    public double alanHesapla() {
        return kenar * kenar;
    }

}

class Daire implements Alan, Cevre, Sekil {

    public double r;

    public Daire(double r) {
        this.r = r;
    }

    @Override
    public double cevreHesapla() {
        return 2 * (Math.PI) * r;
    }

    @Override
    public double alanHesapla() {
        return (Math.PI) * (Math.pow(r, 2));
    }

}

class Dikdortgen implements Alan, Cevre, Sekil {

    public double uzunkenar;
    public double kisakenar;

    public Dikdortgen(double uzunkenar, double kisakenar) {
        this.uzunkenar = uzunkenar;
        this.kisakenar = kisakenar;
    }

    @Override
    public double cevreHesapla() {
        return uzunkenar * 2 + kisakenar * 2;
    }

    @Override
    public double alanHesapla() {
        return uzunkenar * kisakenar;
    }

}

interface Pano {
    public double hesapla(ArrayList<Sekil> sekils);
}

class AlanPano implements Pano {

    public double hesapla(ArrayList<Sekil> sekils) {
        double toplam = 0;
        for (Sekil sekil : sekils) {
            if (sekil instanceof Alan) {
                toplam += ((Alan) sekil).alanHesapla();
            }

        }
        System.out.println("Toplam alanlar : " + toplam);
        return toplam;
    }
}

class CevrePano implements Pano {

    @Override
    public double hesapla(ArrayList<Sekil> sekils) {
        double toplam = 0;
        for (Sekil sekil : sekils) {
            if (sekil instanceof Cevre) {
                toplam += ((Cevre) sekil).cevreHesapla();
            }

        }
        System.out.println("Toplam cevreler : " + toplam);
        return toplam;
    }

}
