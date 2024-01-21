package Lab_Hafta_7_Liskov_dependency_interfaceSeg.ferrari;

public class Bmw extends Car implements IKlima {

    public Bmw(double _hiz, double _hizlanma) {
        super(_hiz, _hizlanma);

    }

    @Override
    public void hiziArttir() {
        this._hiz += _hizlanma;
    }

    @Override
    public void openKlima() {
        System.out.println("Bmw Klima acti");
        this._hizlanma = _hizlanma - _hizlanma * 10 / 100;
    }

    @Override
    public void calistir() {
        System.out.println("Bmw Calisti");

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
