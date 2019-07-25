package lesson17;

import java.util.Arrays;
import java.util.List;

/*
Дан список целых чисел. Найти среднее всех нечётных чисел, делящихся на 5.
 */

public class Lesson17Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 16, 10, 25, 14, 100, 55, 61);
        System.out.println("Исходный список чисел: " + numbers);
        double numbersFilterAverage = numbers.stream()
                .filter(n -> n % 2 != 0 && n % 5 == 0)//фильтр по нечетным, делящимся на 5;
                .mapToInt(n -> n)//распаковка каждого элемента Integer в int
                .average().getAsDouble();//вычисление среднего

        System.out.printf("Cреднее значение всех нечётных чисел, делящихся на 5: %.2f", numbersFilterAverage);
    }
}
