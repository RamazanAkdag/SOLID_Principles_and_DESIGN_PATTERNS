package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer.MediaPlayerTekrar;

import java.util.ArrayList;

public class ChannelsActivity implements Activity {
    ArrayList<Channel> channels;

    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void onCreate() {
        this.channels = new ArrayList<>();
    }

}
