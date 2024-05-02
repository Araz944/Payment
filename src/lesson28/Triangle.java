package lesson28;

public class Triangle implements Shape {
    private final double a;
    private final double b;
    private final double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double square() {
        return (a * b * c) / 2; // not actually correct formula for triangle
    }
}
