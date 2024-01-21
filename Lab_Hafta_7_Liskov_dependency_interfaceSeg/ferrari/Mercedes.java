package Lab_Hafta_7_Liskov_dependency_interfaceSeg.ferrari;

import java.io.IOException;
import java.util.Scanner;

public class Mercedes extends Car implements ITurbo {

    public Mercedes(double _hiz, double _hizlanma) {
        super(_hiz, _hizlanma);

    }

    @Override
    public void hiziArttir() {
        this._hiz += _hizlanma;
    }

    @Override
    public void openTurbo() {
        System.out.println("mercedes turbo acti");
        this._hizlanma = _hizlanma * 2;
    }

    @Override
    public void calistir() {
        System.out.println("Mercedes Calisti");

        Scanner scanner = new Scanner(System.in);

        Thread turboKontrolThread = new Thread(() -> {
            System.out.println("thread calisti");
            while (true) {
                // Kullanıcıdan tuş girişi kontrolü

                String tus = scanner.nextLine();
                if (tus.equals("t")) {

                    openTurbo();
                    return;
                }

            }
        });

        turboKontrolThread.start();

        int x = 0;
        while (x != 10) {
            this.hiziArttir();
            System.out.println("hiz : " + this._hiz);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
