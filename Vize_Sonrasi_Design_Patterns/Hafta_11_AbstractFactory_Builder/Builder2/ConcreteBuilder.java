public class ConcreteBuilder implements ISekilBuilder {
    private Sekil sekil;

    public ConcreteBuilder() {
        sekil = new Sekil();
    }

    @Override
    public ISekilBuilder insertKenarSayisi(int kenay) {
        sekil.setKenarSayisi(kenay);
        return this;
    }

    @Override
    public ISekilBuilder insertKenarUzunlugu(int kenarUzi) {
        sekil.setKenarUzunlugu(kenarUzi);
        return this;
    }

    @Override
    public ISekilBuilder insertBasKonum(int konum) {
        sekil.setBasKonum(konum);
        return this;
    }

    @Override
    public ISekilBuilder insertKenarKalinlik(int kenarKalinligi) {
        sekil.setKenarKalinligi(kenarKalinligi);
        return this;
    }

    @Override
    public ISekilBuilder insertKenarRenk(String renk) {
        sekil.setRenk(renk);
        return this;

    }

    @Override
    public ISekilBuilder insertIcRenk(String icrenk) {
        sekil.setIcRenk(icrenk);
        return this;

    }

    @Override
    public Sekil build() {
        return this.sekil;
    }

}
