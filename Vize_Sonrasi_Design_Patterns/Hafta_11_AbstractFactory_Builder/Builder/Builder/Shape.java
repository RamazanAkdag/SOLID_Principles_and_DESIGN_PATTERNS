package dersKodlar.Vize_Sonrasi_Design_Patterns.Hafta_11_AbstractFactory_Builder.Builder.Builder;

public class Shape {
    private int numberOfEdges;
    private Position startPosition;
    private int edgeLength;
    private int edgeThickness;
    private String edgeColor;
    private String fillColor;

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }

    public Position getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int getEdgeThickness() {
        return edgeThickness;
    }

    public void setEdgeThickness(int edgeThickness) {
        this.edgeThickness = edgeThickness;
    }

    public String getEdgeColor() {
        return edgeColor;
    }

    public void setEdgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return "Shape [numberOfEdges=" + numberOfEdges + ", startPosition=" + startPosition + ", edgeLength="
                + edgeLength + ", edgeThickness=" + edgeThickness + ", edgeColor=" + edgeColor + ", fillColor="
                + fillColor
                + "]";
    }
}
