package lesson11;

import java.util.*;

/*
Написать метод countUnique, который принимает целочисленный список в качестве параметра и возвращает количество
уникальных целых чисел в этом списке. При получении пустого списка метод должен возвращать 0.
Пример:
[3, 7, 3, -1, 2, 3, 7, 2, 15, 15] вернёт 5.
 */
public class Lesson11Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15));
        System.out.println("Количество уникальных элементов в списке: " + countUnique(list));
    }

    public static int countUnique(List<Integer> list) {
        //создаем множество на основании списка, в нем могут хранится только уникальные значения
        //размер множества и есть кол-во уникальных значений
        Set<Integer> set = new HashSet<>(list);
        return set.size();
    }
}
