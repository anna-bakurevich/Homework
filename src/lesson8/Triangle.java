package lesson8;

public class Triangle extends Shape implements HeightTriangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double side1, double side2, double side3) {
        this.a = side1;
        this.b = side2;
        this.c = side3;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {
        return 0.5 * a * heightTriangle();
    }

    @Override
    public String toString() {
        return String.valueOf(Triangle.class);
    }

    @Override
    public double heightTriangle() {
        double p = 0.5 * perimeter();
        return 2 * Math.sqrt(p * (p - a) * (p - b) * (p - c)) / a;
    }
}
