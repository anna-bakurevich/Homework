package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Использовать Алгоритмы. Не используя вспомогательных объектов, переставить отрицательные элементы сгенерированного списка
в конец, а положительные – в начало этого списка.
 */
public class Lesson10Task7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 6, -1, 100, -20, 15, 60, 24, -50, -3, -15));
        System.out.println("Исходный список: " + list);

        //сортируем по возрастанию
        Collections.sort(list);

        //видоизменяем список в обратном порядке следования элементов
        Collections.reverse(list);
        System.out.println("Результат: " + list);
    }
}
