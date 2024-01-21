package Lab_Hafta_7_Liskov_dependency_interfaceSeg.ferrari;

public abstract class Car {
    public double _hiz;
    public double _hizlanma;

    public Car(double _hiz, double _hizlanma) {
        this._hiz = _hiz;
        this._hizlanma = _hizlanma;
    }

    public double get_hiz() {
        return _hiz;
    }

    public void set_hiz(double _hiz) {
        this._hiz = _hiz;
    }

    public double get_hizlanma() {
        return _hizlanma;
    }

    public void set_hizlanma(double _hizlanma) {
        this._hizlanma = _hizlanma;
    }

    public abstract void hiziArttir();

    public abstract void calistir();
}
