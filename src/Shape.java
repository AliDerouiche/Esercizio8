enum shapeType {
    quadrilatero,
    trilatero
}

public class Shape {
    private double base;
    private double height;
    private shapeType shape;

    public Shape(double base, double height, shapeType shape) {
        this.base = base;
        this.height = height;
        this.shape = shape;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "base=" + base +
                ", height=" + height +
                ", shape=" + shape +
                '}';
    }

    public shapeType getShape() {
        return shape;
    }

    public void setShape(shapeType shape) {
        this.shape = shape;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double areaCalculator() {
        double area = (base * base) * 2;

        return area;
    }
}
