package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_10_Singleton.MediaPlayer;

import java.util.Scanner;

public class MediaPlayer implements IUInterface {
    private static MediaPlayer mediaPlayer;
    Chanel kanal;

    private MediaPlayer() {

    }

    public static MediaPlayer getInstance() {
        if (mediaPlayer == null) {
            synchronized (MediaPlayer.class) {
                if (mediaPlayer == null) {
                    mediaPlayer = new MediaPlayer();
                }
            }
        }
        return mediaPlayer;

    }

    @Override
    public void onCreate() {
        play();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println(kanal.getName() + " isimli kanal " + kanal.getLink() + " oynatılıyor");

                while (true) {
                    System.out.println(kanal.getName() + " isimli kanal " + kanal.getLink() + " oynatılıyor");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                }
            }

        });
        thread.start();

    }

    public void pause() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("radio paused (press t to start)");
        while (true) {
            if (scanner.nextLine().equalsIgnoreCase("t")) {
                play();
                return;
            }
        }

    }

}
