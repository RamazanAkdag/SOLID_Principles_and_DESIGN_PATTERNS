package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer.MediaPlayerTekrar;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Channel chanel1 = new Channel("KanalD", "KanalD.com");
        Channel chanel2 = new Channel("Fox", "Fox.com");

        ChannelsActivity chanelActivity = new ChannelsActivity();
        MediaActivity mediaActivity = new MediaActivity();

        chanelActivity.onCreate();
        chanelActivity.addChannel(chanel2);
        chanelActivity.onCreate();
        chanelActivity.addChannel(chanel1);

        mediaActivity.onCreate();
        mediaActivity.choiceChannel(chanel2);
        mediaActivity.play();
        Thread.sleep(5000);
        mediaActivity.onCreate();
        mediaActivity.choiceChannel(chanel1);
        Thread.sleep(5000);
        mediaActivity.onCreate();
        mediaActivity.pause();

    }
}
