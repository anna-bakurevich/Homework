package lesson8;

public class Square extends Rectangle {
    private double a;

    public Square(double a) {
        super(a);
    }

    @Override
    public double perimeter() {
        return 4 * getA();
    }

    @Override
    public double area() {
        return getA() * getA();
    }

    @Override
    public double diagonalRectangle() {
        return Math.sqrt(2) * getA();
    }

    @Override
    public String toString() {
        return String.valueOf(Square.class);
    }
}
