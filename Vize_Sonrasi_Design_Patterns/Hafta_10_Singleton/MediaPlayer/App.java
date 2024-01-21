package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Chanel kanal = new Chanel("Radyo D", "104.00");
        Chanel kanal2 = new Chanel("number 1", "102.4");
        Chanel kanal3 = new Chanel("powerFm", "109.1");
        Chanel kanal4 = new Chanel("ramoTürk", "21.19");
        ArrayList<Chanel> channels = new ArrayList<>();
        channels.add(kanal);
        channels.add(kanal2);
        channels.add(kanal3);
        channels.add(kanal4);
        ChannelList channelList = new ChannelList(channels);
        channelList.onCreate();

    }

}
