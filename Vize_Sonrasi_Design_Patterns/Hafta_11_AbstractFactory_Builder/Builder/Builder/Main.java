package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.Builder.Builder;

public class Main {
    public static void main(String[] args) {
        IShapeBuilder builder = new ShapeBuilder1();
        ShapeDirector director = new ShapeDirector(builder);

        Shape shape = director.create();

        System.out.println(shape);
    }
}