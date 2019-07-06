package lesson13;

/**
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 */

public class Lesson13DZTask1 {
    public static void main(String[] args) {
        String s = "Я не реву, уверен я";

        //удаляем все пробелы
        String s1 = s.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(s1);

        //реверс строки
        String s2 = sb.reverse().toString();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }


    }
}
