package lesson17;

import java.util.HashMap;
import java.util.Map;

/*
Дана Map<String, Integer>. Найти сумму всех значений, длина ключей которых меньше 7 символов.
 */
public class Lesson17Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Андрей", 45);
        map.put("Анна", 45);
        map.put("Алексей", 22);
        map.put("Александр", 19);
        map.put("Мария", 7);
        System.out.println(map);

        int sum = map.entrySet().stream()//получаем поток элементов множества пар "ключ=значение"
                .filter(key -> key.getKey().length() < 7)//фильтруем по ключам с длиной менее 7 символов
                .mapToInt(e -> e.getValue())//получаем поток элемнтов множества целочисленных значений
                .sum();

        System.out.println("Сумма всех значений, длина ключей которых меньше 7 символов: " + sum);
    }
}

