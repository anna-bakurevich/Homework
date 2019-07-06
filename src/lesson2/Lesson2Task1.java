package lesson2;

import java.util.Scanner;

/**
 * Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
 * Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
 * Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"
 * Использовать методы класса String: equals(String string), equalsIgnoreCase(String string), length().
 */
public class Lesson2Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();

        scanner.close();

        if (word1.equals(word2)) {
            System.out.println("Отлично! Слова одинаковы");
        } else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("Хорошо. Почти одинаковы");
        } else if (word1.length() == word2.length()) {
            System.out.println("Ну, хотя бы они одинаковой длины");
        } else {
            System.out.println("Они совсем-совсем разные");
        }
    }
}
