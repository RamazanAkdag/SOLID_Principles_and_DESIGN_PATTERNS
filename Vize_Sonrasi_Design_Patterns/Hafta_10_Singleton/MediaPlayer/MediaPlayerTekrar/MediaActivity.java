package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer.MediaPlayerTekrar;

public class MediaActivity implements Activity {
    MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.getInstance();
    }

    public void play() {
        mediaPlayer.start();
    }

    public void pause() {
        mediaPlayer.stop();
    }

    public void choiceChannel(Channel channel) {
        mediaPlayer.setChannel(channel);
    }

}
