package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.AbstractFactory2;

public class CModelFactory implements ICarFactory {

    @Override
    public IMotor createMotor() {
        return new UcSilindirMotor();
    }

    @Override
    public ITekerlek createTekerlek() {
        return new YazTekerlek();
    }

    @Override
    public ISanziman createSanziman() {
        return new OtoSanziman();
    }

    @Override
    public IRenk createRenk() {
        return new KirmiziRenk();
    }

    @Override
    public Car produceCar() {
        return new Car(this.createMotor(), this.createSanziman(), this.createRenk(), this.createTekerlek());
    }

}
