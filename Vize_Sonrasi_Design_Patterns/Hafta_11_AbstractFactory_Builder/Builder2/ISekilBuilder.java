public interface ISekilBuilder {
    public ISekilBuilder insertKenarSayisi(int kenay);

    public ISekilBuilder insertKenarUzunlugu(int kenarUzi);

    public ISekilBuilder insertBasKonum(int konum);

    public ISekilBuilder insertKenarKalinlik(int kenarKalinligi);

    public ISekilBuilder insertKenarRenk(String renk);

    public ISekilBuilder insertIcRenk(String icrenk);

    public Sekil build();
}
