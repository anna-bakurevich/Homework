package lesson8;

public class Ellipse extends Shape {
    //оси
    private double a;
    private double b;

    Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    Ellipse(double a) {
        this.a = a;
    }

    public Ellipse() {
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public double getB() {
        return b;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((getA() * getA() + getB() * getB()) / 8);
    }

    @Override
    public double area() {
        return Math.PI * getA() / 2 * getB() / 2;
    }

    @Override
    public String toString() {
        return String.valueOf(Ellipse.class);
    }


}
