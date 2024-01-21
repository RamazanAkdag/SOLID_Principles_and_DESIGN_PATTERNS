package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer;

public class Chanel {
    public Chanel(String name, String link) {
        this.name = name;
        this.link = link;
    }

    private String name;
    private String link;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
