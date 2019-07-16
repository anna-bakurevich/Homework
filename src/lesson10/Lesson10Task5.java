package lesson10;

/*
Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lesson10Task5 {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        System.out.println(set1);
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4, 6, 7, 8, 10));
        System.out.println(set2);
        System.out.println("Пересечение множеств: " + intersect(set1, set2));
        System.out.println("Объединение множеств: " + unification(set1, set2));

    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static Set<Integer> unification(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }
}
