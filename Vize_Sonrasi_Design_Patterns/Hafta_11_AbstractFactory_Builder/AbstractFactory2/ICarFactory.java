package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.AbstractFactory2;

public interface ICarFactory {
    public IMotor createMotor();

    public ITekerlek createTekerlek();

    public ISanziman createSanziman();

    public IRenk createRenk();

    // public FactS
    public Car produceCar();
}
