package lesson13;


import java.util.Formatter;

/**
 * Написать функцию, принимающую на вход целое число, возвращающую строку из 10 символов, дополненных слева нулями.
 * Если число выходит за размер 10 символов вернуть все нули.
 * Пример getString(22) -> 0000000022
 * Найти 3 способа решения задачи и определить наиболее быстрый способ
 */
public class Lesson13Task7 {
    public static void main(String[] args) {
        long n = 2222222222L;
        System.out.println(getStringFor(n));
        System.out.println("---------------------------");
        System.out.println(getStringLine(n));
        System.out.println("---------------------------");
        System.out.println(getStringFormatter(n));
        System.out.println("---------------------------");

    }

    public static String getStringFor(long n) {
        long startTime1 = System.nanoTime();
        String s = "";
        String numberString = s.valueOf(n);

        if (numberString.length() < 10) {
            int countZero = 10 - numberString.length();
            for (int i = 0; i < countZero; i++) {
                s += "0";
            }
            s += numberString;
        } else if (numberString.length() == 10) {
            s = numberString;
        } else s = "0000000000";
        long finishTime1 = System.nanoTime();
        System.out.println("Время работы метода getStringFor: " + (finishTime1 - startTime1) + " наносекунд");
        return s;
    }

    public static String getStringLine(long n) {
        long startTime1 = System.nanoTime();
        String s = "";
        String numberString = "" + n;
        if (numberString.length() <= 10) {
            s = ("0000000000" + n).substring(numberString.length()); //дописываем нули и вырезаем лишние = кол-ву цифр числа;
        } else {
            s = "0000000000";
        }
        long finishTime1 = System.nanoTime();
        System.out.println("Время работы метода getStringLine: " + (finishTime1 - startTime1) + " наносекунд");
        return s;
    }

    public static String getStringFormatter(long n) {
        long startTime1 = System.nanoTime();
        String s = "";
        Formatter f = new Formatter();
        String numberString = "" + n;
        if (numberString.length() <= 10) {
            f.format("%010d", n); //формат = длина числа - 10, свободные позиции слева заполняются нулями;
            s = f.toString();
        } else {
            s = "0000000000";
        }
        long finishTime1 = System.nanoTime();
        System.out.println("Время работы метода getStringFormatter: " + (finishTime1 - startTime1) + " наносекунд");
        return s;
    }
}
