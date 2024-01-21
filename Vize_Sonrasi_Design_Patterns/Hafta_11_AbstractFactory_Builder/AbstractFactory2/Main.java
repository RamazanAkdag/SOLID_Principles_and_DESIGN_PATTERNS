package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.AbstractFactory2;

public class Main {
    public static Car getCar(ICarFactory factory) {
        return factory.produceCar();
    }

    public static void main(String[] args) {
        AModelFactory factory = new AModelFactory();

        System.out.println("selam : " + getCar(factory));
    }
}
