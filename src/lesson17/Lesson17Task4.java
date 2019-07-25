package lesson17;

/*
Дан список целых чисел, вывести строку, представляющую собой конкатенацию строковых представлений этих чисел.
Пример: список {5, 2, 4, 2, 1}
Результирующая строка: "52421"
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson17Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 4, 2, 1);
        String result = numbers.stream()
                .map(n -> n.toString())//преобразуем каждый элемент в String
                .collect(Collectors.joining());//объединяем все элементы в одну строку

        System.out.println("Исходный список цифр: " + numbers);
        System.out.println("Результирующая строка: " + result);
    }
}
