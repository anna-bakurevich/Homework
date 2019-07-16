package lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Создать список оценок учеников с помощью ListIterator, заполнить случайными оценками.
Найти самую высокую оценку с использованием итератора.
 */

public class Lesson10Task2 {
    public static void main(String[] args) {

        List<Integer> ratings = new ArrayList();
        //заполняем список случайными оценками в диапазоне [1;10], используя метод из задачи Lesson10Task1
        Lesson10Task1.listAdd(ratings);
        System.out.print("Список оценок: ");
        Lesson10Task1.listPrintLine(ratings);

        Iterator<Integer> iterator = ratings.iterator();
        //считаем максимальным первый элемент списка
        int max = ratings.get(0);
        while (iterator.hasNext()) {
            int current = iterator.next();
            //в случае нахождения бОльшего, изменяем значение переменной max
            if (current > max) {
                max = current;
            }
        }

        System.out.println("Максимальная оценка в списке: " + max);
    }
}
