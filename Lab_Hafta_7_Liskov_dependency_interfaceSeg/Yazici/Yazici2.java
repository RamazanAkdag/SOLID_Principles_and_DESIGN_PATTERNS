package Lab_Hafta_7_Liskov_dependency_interfaceSeg.Yazici;

public class Yazici2 implements Yazdirabilir {

    @Override
    public void yazdir(String yazi) {
        System.out.println("Yazici2 yazdirdi : " + yazi);
    }

}
