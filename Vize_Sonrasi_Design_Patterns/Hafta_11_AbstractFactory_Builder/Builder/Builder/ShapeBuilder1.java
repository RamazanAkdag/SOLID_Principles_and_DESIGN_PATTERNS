package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.Builder.Builder;

public class ShapeBuilder1 implements IShapeBuilder {
    private Shape shape;

    public ShapeBuilder1() {
        this.shape = new Shape();
    }

    @Override
    public IShapeBuilder setNumberOfEdges(int number) {
        shape.setNumberOfEdges(number);
        return this;
    }

    @Override
    public IShapeBuilder setStartPosition(Position position) {
        shape.setStartPosition(position);
        return this;
    }

    @Override
    public IShapeBuilder setEdgeLength(int length) {
        shape.setEdgeLength(length);
        return this;
    }

    @Override
    public IShapeBuilder setEdgeThickness(int thickness) {
        shape.setEdgeThickness(thickness);
        return this;
    }

    @Override
    public IShapeBuilder setEdgeColor(String color) {
        shape.setEdgeColor(color);
        return this;
    }

    @Override
    public IShapeBuilder setFillColor(String color) {
        shape.setFillColor(color);
        return this;
    }

    @Override
    public Shape Build() {
        return this.shape;
    }
}
