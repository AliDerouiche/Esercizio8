public class Rectangle extends Shape {
    public Rectangle(double base, double height, shapeType shape) {
        super(base, height, shape);
    }

    @Override
    public double areaCalculator() {
        double base = getBase();
        double height = getHeight();
        double area = base * height;
        return area;
    }
}
