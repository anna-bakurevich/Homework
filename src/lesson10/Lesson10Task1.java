package lesson10;

import java.util.*;

/*
Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Удалить неудовлетворительные оценки из списка.
 */
public class Lesson10Task1 {
    public static void main(String[] args) {
        //используем LinkedList для быстрого удаления элементов из середины списка
        List<Integer> ratings = new LinkedList<>();

        listAdd(ratings);//заполнение списка
        System.out.print("Исходный список: ");
        listPrintLine(ratings);//вывод списка

        ListIterator<Integer> iterator = ratings.listIterator();
        int min = 4; //все оценки менее min считать неудовлетворительными
        while (iterator.hasNext()) {
            int current = iterator.next();
            if (current < min) {
                iterator.remove();
            }
        }
        System.out.print("Рузультат: ");
        listPrintLine(ratings);//вывод списка без неудовлетворительных оценок
    }

    //метод, заполняющий список случайными оценками в диапазоне [1;10]
    public static void listAdd(List list) {
        ListIterator<Integer> iterator = list.listIterator();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            iterator.add(random.nextInt(10) + 1);
        }
    }

    //метод, выводящий в консоль содержимое списка в строку
    public static void listPrintLine(List list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
