package lesson13;

import java.util.Scanner;

/**
 * Написать функцию, принимающаю два параметра: строку и слово и возвращающую true, если строка
 * начинается и заканчивается этим словом
 */
public class Lesson13Task3 {
    public static void main(String[] args) {

        System.out.println(isWordStartFinish("hello, world, hello", "hello"));
    }

    public static boolean isWordStartFinish(String line, String word) {
        boolean result = false;
        if (line.startsWith(word) && line.endsWith(word)) {
            result = true;
        }
        return result;
    }
}
