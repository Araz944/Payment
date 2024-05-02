package lesson28;

public class Main {
    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(4, 5, 6);
        System.out.println("Triangle perimeter is " + myTriangle.perimeter());
        System.out.println("Triangle area is " + myTriangle.square());

        Rectangle myRectangle = new Rectangle(10, 6);
        System.out.println("Rectangle perimeter is " + myRectangle.perimeter());
        System.out.println("Rectangle area is " + myRectangle.square());
    }
}
