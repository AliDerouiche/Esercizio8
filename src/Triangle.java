public class Triangle extends Shape {
    public Triangle(double base, double height, shapeType shape) {
        super(base, height, shape);
    }

    @Override
    public double areaCalculator() {
        double base = getBase();
        double height = getHeight();
        double area = (base * height) / 2;
        return area;
    }
}
