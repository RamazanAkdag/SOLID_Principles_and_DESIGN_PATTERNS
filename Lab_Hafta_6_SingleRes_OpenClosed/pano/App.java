package Lab_Hafta_6_SingleRes_OpenClosed.pano;

public class App {

    public static void main(String[] args) {

        Sekil sekil = new Kare(10);
        Sekil sekil2 = new Ucgen(3, 4, 5, 3);

        Hesapla.alanHsp(sekil2);
        Hesapla.alanHsp(sekil);

    }

}
