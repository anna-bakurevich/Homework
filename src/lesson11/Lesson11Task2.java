package lesson11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Написать метод isUnique, который принимает Map<String, String> и возвращает true, если два различных ключа
не соответствуют двум одинаковым значениям.
Например, в данном случае вернётся true:
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
А в данном - false:
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 */
public class Lesson11Task2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Miller");
        map.put("Hal", "Perkins");
        System.out.println("Результат работы метода: " + isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        int countValues = map.values().size();
        System.out.println("Количество всех значений: " + countValues);
        Set<String> set = new HashSet<>(map.values());
        int countUniqueValues = set.size();
        System.out.println("Количество уникальных значений: " + countUniqueValues);
        if (countValues == countUniqueValues) {
            return true;
        } else {
            return false;
        }
    }
}
