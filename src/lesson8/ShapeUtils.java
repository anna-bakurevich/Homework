package lesson8;
//Создать класс ShapeUtils со статическими методами:
//1. Определяющим, является ли фигура прямоугольником.
//2. Определяющим, является ли фигура треугольником.

public class ShapeUtils {
    public static boolean isRectangle(Shape shape) {
        if (shape instanceof Rectangle) {
            System.out.println("Фигура является прямоугольником");
            return true;
        } else {
            System.out.println("Фигура не является прямоугольником");
            return false;
        }
    }

    public static boolean isTriangle(Shape shape) {
        if (shape instanceof Triangle) {
            System.out.println("Фигура является треугольником");
            return true;
        } else {
            System.out.println("Фигура не является треугольником");
            return false;
        }
    }
}
