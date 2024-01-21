package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer.MediaPlayerTekrar;

public class MediaPlayer implements Runnable {
    private static MediaPlayer mediaPlayer;
    private boolean control;
    private Channel channel;

    private MediaPlayer() {
        control = true;
    }

    public static MediaPlayer getInstance() {
        if (mediaPlayer == null) {

            mediaPlayer = new MediaPlayer();
        }
        return mediaPlayer;

    }

    @Override
    public void run() {

        while (control) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(channel.getIsim() + " kanalından " + channel.getLink() + " adresinden oynatılıyor");
        }
    }

    public void start() {
        control = true;
        (new Thread(this)).start();
    }

    public void stop() {
        control = false;

    }

    public boolean isControl() {
        return control;
    }

    public void setControl(boolean control) {
        this.control = control;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

}
