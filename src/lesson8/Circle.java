package lesson8;

public class Circle extends Ellipse implements LengthArc {
    private double a; //радиус
    private double b; //центральный угол

    Circle(double a) {
        this.a = a;
    }

    Circle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }


    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * a;
    }

    @Override
    public double area() {
        return Math.PI * a * a;
    }

    @Override
    public String toString() {
        return String.valueOf(Circle.class);
    }

    @Override
    public double lengthArc() {
        return Math.PI * a * b / 180;
    }
}
