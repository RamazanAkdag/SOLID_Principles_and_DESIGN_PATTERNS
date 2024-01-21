package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.Builder.Builder;

public class ShapeDirector {
    public ShapeDirector(IShapeBuilder builder) {
        this.builder = builder;
    }

    IShapeBuilder builder;

    public Shape create() {
        Shape shape = builder.setStartPosition(new Position(5, 3)).setFillColor("red").setEdgeColor("Yellow")
                .setEdgeLength(4)
                .setEdgeThickness(7).Build();

        return shape;
    }
}
