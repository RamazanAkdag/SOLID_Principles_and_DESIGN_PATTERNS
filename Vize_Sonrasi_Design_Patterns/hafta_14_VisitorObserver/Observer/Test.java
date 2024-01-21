package hafta_14_VisitorObserver.Observer;

public class Test {
    public static void main(String[] args) {
        kullanici kullanici = new kullanici("ramo");
        kullanici kullanici2 = new kullanici("oyku");
        kullanici kullanici3 = new kullanici("Aziz");
        kullanici kullanici4 = new kullanici("beko");

        Sayfa sayfa = new Sayfa("sayfa");
        Sayfa sayfa2 = new Sayfa("sayfa2");

        Grup grup = new Grup();
        grup.getGrupUyeleri().add(kullanici);
        grup.getGrupUyeleri().add(kullanici);

        sayfa.getTakipcis().add(kullanici2);
        sayfa.getTakipcis().add(kullanici3);
        sayfa.getTakipcis().add(kullanici4);
        sayfa.getTakipcis().add(grup);

        sayfa.gonderiPaylas("selamun aleykum babbbaa  ilk gonderi babba");

    }
}
