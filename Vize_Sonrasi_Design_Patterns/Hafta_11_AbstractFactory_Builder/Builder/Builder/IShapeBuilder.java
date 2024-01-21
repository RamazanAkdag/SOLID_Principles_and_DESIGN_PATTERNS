package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.Builder.Builder;

public interface IShapeBuilder {
    public IShapeBuilder setNumberOfEdges(int number);

    public IShapeBuilder setStartPosition(Position position);

    public IShapeBuilder setEdgeLength(int length);

    public IShapeBuilder setEdgeThickness(int thickness);

    public IShapeBuilder setEdgeColor(String color);

    public IShapeBuilder setFillColor(String color);

    public Shape Build();
}
