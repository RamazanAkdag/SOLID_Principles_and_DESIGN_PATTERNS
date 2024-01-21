package Lab_Hafta_7_Liskov_dependency_interfaceSeg.ferrari;

public class Ferrari extends Car implements IKlima, ITurbo {

    public Ferrari(double _hiz, double _hizlanma) {
        super(_hiz, _hizlanma);

    }

    @Override
    public void hiziArttir() {

    }

    @Override
    public void openTurbo() {
        System.out.println("ferrari turbo acti");
        this._hizlanma = _hizlanma * 2;
    }

    @Override
    public void openKlima() {
        System.out.println("ferrari klima acti");
        this._hizlanma = _hizlanma - _hizlanma * 10 / 100;
    }

    @Override
    public void calistir() {
        System.out.println("Ferrari Calisti");
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
