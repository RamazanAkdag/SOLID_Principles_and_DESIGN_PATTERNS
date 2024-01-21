package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.AbstractFactory2;

public class AModelFactory implements ICarFactory {

    @Override
    public IMotor createMotor() {
        return new DortSilindirMotor();
    }

    @Override
    public ITekerlek createTekerlek() {
        return new KisTekerlek();
    }

    @Override
    public ISanziman createSanziman() {
        return new DuzSanziman();
    }

    @Override
    public IRenk createRenk() {
        return new BeyazRenk();
    }

    @Override
    public Car produceCar() {
        return new Car(this.createMotor(), this.createSanziman(), this.createRenk(), this.createTekerlek());
    }

}
