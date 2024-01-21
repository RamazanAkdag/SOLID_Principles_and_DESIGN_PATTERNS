
package Lab_Hafta_7_Liskov_dependency_interfaceSeg.Yazici;

public class Yazici1 implements Tarayabilir, Yazdirabilir {

    @Override
    public void yazdir(String yazi) {
        System.out.println("yazici1 yazdirdi : " + yazi);
    }

    @Override
    public void tara(String pdf) {
        System.out.println("Yazici1 taradi : " + pdf);
    }

}