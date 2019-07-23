package lesson14;

/*
Написать программу, проверяющую, является ли введённая строка адресом электронного почтового ящика.
В названии почтового ящика разрешить использование только букв, цифр и нижних подчёркиваний,
при этом оно должно начинаться с буквы.
Возможные домены верхнего уровня: .org .com
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson14Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        //структура регулярного выражения: начало строки; буквенный символ в обоих регистрах; любые буквы, цифры,
        //нижнее подчеркивание (ноль или более раз); @; любые буквы, цифры, нижнее подчеркивание (один или более раз);
        //точка; org или com; конец строки
        Pattern pattern = Pattern.compile("^[a-zA-Z]\\w*@\\w+\\.(org|com)$");
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            System.out.println("Введенная строка является адресом электронного почтового ящика.");
        } else {
            System.out.println("Введенная строка не является адресом электронного почтового ящика.");
        }
    }
}
