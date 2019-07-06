package lesson2;

import java.util.Scanner;

/**
 * Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
 * Программа должна определять, является ли введённая дата реальной и выводить результат.
 * Использовать следующую информацию:
 * Январь, март, май, июль, август, октябрь, декабрь - 31 день
 * Апрель, июнь, сентябрь, ноябрь - 30 дней
 * Февраль - 28 дней в обычный год, 29 дней в високосный
 */
public class Lesson2Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        boolean result = false;
        boolean month31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean month30 = month == 4 || month == 6 || month == 9 || month == 11;

        if (year > 0) {
            if ((day > 0 && day <= 31) && month31) {
                result = true;
            } else if ((day > 0 && day <= 30) && month30) {
                result = true;
            } else if (((day > 0 && day <= 28) && month == 2) || (day == 29 && month == 2) && leapYear(year)) {
                result = true;
            }
        }
        if (result == true) {
            System.out.println("Такая дата существует.");
        } else {
            System.out.println("Такой даты не существует.");
        }

    }

    //метод, определяющий, является ли год високоскным
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
