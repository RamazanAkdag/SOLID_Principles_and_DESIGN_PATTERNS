package Lab_Hafta_7_Liskov_dependency_interfaceSeg.Yazici;

public class App {
    public static void main(String[] args) {
        Yazici1 yazici1 = new Yazici1();
        Yazici2 yazici2 = new Yazici2();

        YaziciProcess ps1 = new YaziciProcess(yazici1);
        YaziciProcess ps2 = new YaziciProcess(yazici2);

        yazici1.yazdir(null);
        yazici2.yazdir(null);

        ps1.yazdir("selamlar");
        ps2.yazdir("selamlarr");

        ps1.tara("uvuuvuv");
        ps2.tara("uvuuvuv");
    }
}
