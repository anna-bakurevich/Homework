package lesson8;

public class Rectangle extends Shape implements DiagonalRectangle{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(double a) {
        this.a = a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.valueOf(Rectangle.class);
    }

    @Override
    public double diagonalRectangle() {
        return Math.sqrt(getA() * getA() + getB() * getB());
    }
}
