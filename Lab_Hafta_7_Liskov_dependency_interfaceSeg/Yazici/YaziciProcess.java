package Lab_Hafta_7_Liskov_dependency_interfaceSeg.Yazici;

public class YaziciProcess {
    private BaseYazici yazici;

    public YaziciProcess(BaseYazici yazici) {
        this.yazici = yazici;
    }

    public void yazdir(String yazi) {
        if (this.yazici instanceof Yazdirabilir) {
            ((Yazdirabilir) this.yazici).yazdir(yazi);
        }

    }

    public void tara(String pdf) {
        if (this.yazici instanceof Tarayabilir) {
            ((Tarayabilir) this.yazici).tara(pdf);
        } else {
            System.out.println("tarayamaz");
        }
    }

}
