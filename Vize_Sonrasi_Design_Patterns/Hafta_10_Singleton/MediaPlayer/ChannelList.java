package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer;

import java.util.ArrayList;
import java.util.Scanner;

public class ChannelList implements IUInterface {
    ArrayList<Chanel> channels;
    String choice;

    public ChannelList(ArrayList<Chanel> kanallar) {
        channels = kanallar;
        onCreate();

    }

    @Override
    public void onCreate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            MediaPlayer mediaPlayer = MediaPlayer.getInstance();
            int i = 1;
            System.out.println("Kanal Listesi  : ");
            for (Chanel kanal : channels) {
                System.out.println(kanal.getName() + " " + kanal.getLink());
                i++;
            }

            choice = scanner.nextLine();

            Chanel secilen = null;
            for (Chanel kanal : channels) {
                if (choice.equals(kanal.getLink())) {
                    secilen = kanal;
                    break;
                }
            }
            if (secilen != null) {

                mediaPlayer.kanal = secilen;
                mediaPlayer.play();

            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }

    void addChannel(Chanel kanal) {
        this.channels.add(kanal);
    }

}
