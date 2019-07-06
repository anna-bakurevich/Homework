package lesson2;

import java.util.Scanner;

/**
 * Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
 * Вывести дату следующего дня в формате "День.Месяц.Год".
 * Учесть переход на следующий месяц, а также следующий год.
 * Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

public class Lesson2DZTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int nextDateDay = 0;
        int nextDateMonth = 0;
        int nextDateYear = 0;

        //проверка на корректность введенной даты
        if (!isDate(day, month, year)) {
            System.out.println("Такой даты не существует");
        } else {

            //если это последний день месяца (кроме декабря)
            if (isLastDayOfMonth(day, month, year)) {
                nextDateDay = 1;
                nextDateMonth = ++month;
                nextDateYear = year;

                //если это последний день в году
            } else if (day == 31 && month == 12) {
                nextDateDay = 1;
                nextDateMonth = 1;
                nextDateYear = ++year;

                //все остальные дни
            } else {
                nextDateDay = ++day;
                nextDateMonth = month;
                nextDateYear = year;
            }
            System.out.println(formatDate(nextDateDay, nextDateMonth, nextDateYear));
        }
    }

    /**
     * Метод, задающий формат даты
     */
    public static String formatDate(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

    /**
     * Метод, проверяющий, является ли дата последним днем месяца (кроме декабря)
     */
    public static boolean isLastDayOfMonth(int day, int month, int year) {
        boolean result = false;
        boolean lastDay31 = day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10);
        boolean lastDay30 = day == 30 && (month == 4 || month == 6 || month == 9 || month == 11);
        boolean lastDay2829 = (day == 28 && month == 2 && !leapYear(year)) || ((day == 29 && month == 2) && leapYear(year));

        if (lastDay31 || lastDay30 || lastDay2829) {
            result = true;
        }
        return result;
    }

    /**
     * Метод, проверяющий существование даты
     */
    public static boolean isDate(int day, int month, int year) {
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
        return result;
    }

    /**
     * Метод, определяющий, является ли год високосным
     */
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
