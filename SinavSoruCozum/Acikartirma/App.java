package SinavSoruCozum.Acikartirma;

public class App {
    public static void main(String[] args) {
        Kullanici sefa = new Kullanici("Sefa Aras", "sefa@ktu.edu");
        Kullanici hakan = new Kullanici("Hakan Bozkurt", "hakan@ktu.edu");

        Urun bilgisayar = new Urun("Bilgisayar", 100);

        System.out.println("1. Teklif");
        bilgisayar.teklifVer(sefa, 50);
        System.out.println("2. Teklif");
        bilgisayar.teklifVer(hakan, 150);
        System.out.println("3. Teklif");
        bilgisayar.teklifVer(sefa, 200);
        System.out.println("4. Teklif");
        bilgisayar.teklifVer(hakan, 250);

    }
}
