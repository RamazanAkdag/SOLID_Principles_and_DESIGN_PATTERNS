package Lab_Hafta_6_SingleRes_OpenClosed.panoTekrar;

import java.util.ArrayList;

public class App {
    public static void yaz(Pano pano, ArrayList<Sekil> sekils) {
        pano.hesapla(sekils);
    }

    public static void main(String[] args) {
        AlanPano alanPano = new AlanPano();
        CevrePano cevrePano = new CevrePano();

        Kare kare = new Kare(5);
        Dikdortgen dikdortgen = new Dikdortgen(5, 10);
        Daire daire = new Daire(7);
        Cember cember = new Cember(18);

        ArrayList<Sekil> sekils = new ArrayList<>();
        sekils.add(kare);
        sekils.add(dikdortgen);
        sekils.add(daire);
        sekils.add(cember);

        yaz(alanPano, sekils);
        yaz(cevrePano, sekils);

    }
}
