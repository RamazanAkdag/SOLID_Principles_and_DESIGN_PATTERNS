package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer.MediaPlayerTekrar;

public class Channel {
    private String isim;
    private String link;

    public Channel(String isim, String link) {
        this.isim = isim;
        this.link = link;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
