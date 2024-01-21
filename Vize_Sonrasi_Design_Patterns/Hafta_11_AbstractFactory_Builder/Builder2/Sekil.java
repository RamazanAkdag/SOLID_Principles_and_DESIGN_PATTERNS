public class Sekil {
    int kenarSayisi;
    int kenarUzunlugu;
    int basKonum;
    int kenarKalinligi;
    String renk;
    String icRenk;

    public int getKenarSayisi() {
        return kenarSayisi;
    }

    public void setKenarSayisi(int kenarSayisi) {
        this.kenarSayisi = kenarSayisi;
    }

    public int getKenarUzunlugu() {
        return kenarUzunlugu;
    }

    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public int getBasKonum() {
        return basKonum;
    }

    public void setBasKonum(int basKonum) {
        this.basKonum = basKonum;
    }

    public int getKenarKalinligi() {
        return kenarKalinligi;
    }

    public void setKenarKalinligi(int kenarKalinligi) {
        this.kenarKalinligi = kenarKalinligi;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getIcRenk() {
        return icRenk;
    }

    public void setIcRenk(String icRenk) {
        this.icRenk = icRenk;
    }

    @Override
    public String toString() {
        return "Sekil [kenarSayisi=" + kenarSayisi + ", kenarUzunlugu=" +
                kenarUzunlugu + ", basKonum=" + basKonum
                + ", kenarKalinligi=" + kenarKalinligi + ", renk=" + renk + ", icRenk=" +
                icRenk + "]";
    }

}
