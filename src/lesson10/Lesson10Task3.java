package lesson10;


import java.util.*;

/*
Вывести учеников из списка в обратном порядке. (2 варианта решения).
 */
public class Lesson10Task3 {

    public static void main(String[] args) {
        List<String> surnames = new ArrayList<>(Arrays.asList("Сидоров", "Иванов", "Петров", "Бакуревич", "Сергейчик", "Филиппов"));
        //исходный список
        System.out.print("Исходный список: ");
        Lesson10Task1.listPrintLine(surnames);

        //список в обратном порядке, вариант 1
        ListIterator<String> iterator = surnames.listIterator(surnames.size());
        System.out.print("Способ 1. Результат: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        //список в обратном порядке, вариант 2
        Collections.reverse(surnames);
        System.out.print("Способ 2. Результат: ");
        Lesson10Task1.listPrintLine(surnames);
    }

}
