package lesson2;

import java.util.Scanner;

/**
 * Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0,
 * где a, b и c - вводимые пользователем из консоли данные.
 * Учитывать только реальные корни (в случае отрицательного дискриминанта выводить сообщение пользователю).
 * При решении создать и использовать следующие вынесенные функции:
 * - функция isPositive, определяющая, является ли число положительным
 * - функция isZero, определяющая, является ли число нулём
 * - функция discriminant, вычисляющая дискриминант
 */
public class Lesson2DZTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double x1;
        double x2;
        double d = discriminant(a, b, c);

        if (isPositive(d)) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Уравнение имеет два корня: " + x1 + "; " + x2);
        } else if (isZero(d)) {
            x1 = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: " + x1);
        }else System.out.println("Уравнение не имеет корней");


    }

    //метод, определяющий, является ли число положительным
    public static boolean isPositive(double number) {
        boolean result = false;
        if (number > 0) {
            result = true;
        }
        return result;
    }

    //метод, определяющий, является ли число нулём
    public static boolean isZero(double number) {
        boolean result = false;
        if (number == 0) {
            result = true;
        }
        return result;
    }

    //метод, вычисляющий дискриминант
    public static double discriminant(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        return discriminant;
    }
}
