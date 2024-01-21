public class SekilDirector {
    ISekilBuilder builder = new ConcreteBuilder();

    public Sekil kenarliSekilVer() {
        return builder.insertKenarSayisi(5).insertKenarKalinlik(3).insertKenarRenk("sari").build();
    }

}
