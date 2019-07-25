package lesson17;

import java.util.Arrays;
import java.util.List;

/*
Дан список строк. Найти количество уникальных строк длиной более 8 символов.
 */

public class Lesson17Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Андрей", "Алексей", "Анна", "Александра", "Георгий", "Александр", "Алексей",
                "Алена", "Валерия");
        System.out.println("Исходный список строк: " + list);

        long countUnique = list.stream()
                .filter(line -> line.length() > 8) //фильтруем по элементам коллекции, длиной более 8 символов
                .distinct()//оставляем только уникальные значения отфильтрованной коллекции
                .count();//подсчитываем их кол-во

        System.out.println("Количество уникальных строк длиной более 8 символов: " + countUnique);
    }
}
