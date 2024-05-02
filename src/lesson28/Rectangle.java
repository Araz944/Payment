package lesson28;

public class Rectangle implements Shape {
    private final double a;
    private final double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double square() {
        return a * b;
    }
}
