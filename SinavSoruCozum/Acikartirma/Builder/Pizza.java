package Builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    @Override
    public String toString() {
        return "Pizza [boyut=" + boyut + ", malzemeler=" + malzemeler + ", pisirmeSuresi=" + pisirmeSuresi + "]";
    }

    public Pizza(String boyut, int pisirmeSuresi) {
        this.boyut = boyut;
        this.malzemeler = new ArrayList<>();
        this.pisirmeSuresi = pisirmeSuresi;
    }

    public Pizza() {
        this.malzemeler = new ArrayList<>();
    }

    String boyut;
    List<String> malzemeler;
    private int pisirmeSuresi;

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public void removeMalzeme(String malzeme) {
        this.malzemeler.remove(malzeme);
    }

    public void addMalzeme(String malzeme) {
        this.malzemeler.add(malzeme);
    }

    public int getPisirmeSuresi() {
        return pisirmeSuresi;
    }

    public void setPisirmeSuresi(int pisirmeSuresi) {
        this.pisirmeSuresi = pisirmeSuresi;
    }

}
