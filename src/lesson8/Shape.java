package lesson8;
/*
Создать иерархию классов, описывающих геометрические фигуры на плоскости.
 */

public abstract class Shape {
    double a;
    double b;
    double c;

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

    public abstract double perimeter();

    public abstract double area();

    public abstract String toString();

    public boolean isEqualsArea(Shape shape) {
        if (area() == shape.area()) {
            System.out.println("Площади фигур равны");
            return true;
        } else {
            System.out.println("Площади фигур не равны");
            return false;
        }
    }
}
