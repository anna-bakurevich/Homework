package lesson13;

import java.util.Scanner;

/**
 * Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.
 */

public class Lesson13Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Считаем    количество слов в    тексте. Их должно быть   9");
        int count = 0;

        //пока доступны лексемы для считывания, считываем по одной и накапливаем кол-во в счетчик
        while (sc.hasNext()) {
            sc.next();
            count++;
        }

        System.out.println("Количество слов в тексте: " + count);
    }
}
