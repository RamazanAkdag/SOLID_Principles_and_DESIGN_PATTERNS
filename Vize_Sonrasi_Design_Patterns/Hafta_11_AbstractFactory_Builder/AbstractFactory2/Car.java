package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.AbstractFactory2;

public class Car {

    public IMotor motor;
    public ISanziman sanziman;
    public IRenk renk;
    public ITekerlek tekerlek;

    public Car(IMotor motor, ISanziman sanziman, IRenk renk, ITekerlek tekerlek) {
        this.motor = motor;
        this.sanziman = sanziman;
        this.renk = renk;
        this.tekerlek = tekerlek;
    }

    @Override
    public String toString() {
        return "Car [motor=" + motor + ", sanziman=" + sanziman + ", renk=" + renk + ", tekerlek=" + tekerlek + "]";
    }

}
