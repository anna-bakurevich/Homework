package lesson18;

import java.util.Map;
import java.util.Random;

public class MethodsMap {
    private static Robot[] robotAllDetails = Robot.values();//перечень деталей для изготовление робота

    //метод подсчета кол-ва деталей, имеющихся в наличии (сумма значений Map)
    public static int countDetails(Map<Enum, Integer> map) {
        int count = 0;
        for (int i : map.values()) {
            count += i;
        }
        return count;
    }

    //метод получения случайного номера детали
    public static int getRandomDetail() {
        Random detail = new Random();
        //получаем случайную деталь (номер в массиве элементов значений класса Robot)
        return detail.nextInt(9);
    }

    //метод добавления детали c номером number класса Robot в Map
    public static void putDetail(Map<Enum, Integer> map, int number) {
        //если такая деталь уже есть (ключ в map), то увеличиваем значение на 1
        if (map.containsKey(robotAllDetails[number])) {
            map.put(robotAllDetails[number], map.get(robotAllDetails[number]) + 1);
            //иначе добавляем в map новую деталь со значением 1
        } else {
            map.put(robotAllDetails[number], 1);
        }
    }

    //метод для изъятия count случайных деталей из Map
    public static void takeAwayDetails(Map<Enum, Integer> map1, Map<Enum, Integer> map2, int count) {
        for (int j = 1; j <= count; j++) {
            int number = getRandomDetail();
            //если такая деталь есть на свалке: добавляем ее в map слуги и уменьшаем кол-во в map свалки
            if (map1.containsKey(robotAllDetails[number]) && map1.get(robotAllDetails[number]) > 0) {
                MethodsMap.putDetail(map2, number);
                map1.put(robotAllDetails[number], map1.get(robotAllDetails[number]) - 1);
            } else {
                continue;
            }
        }
    }
}
