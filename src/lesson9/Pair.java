package lesson9;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
Создать класс Pair, параметризованный двумя параметрами K и V. Класс должен хранить две переменные типов K и V
соответственно. У класса должен быть конструктор, принимающий 2 параметра типов K и V, а также набор соответствующих
геттеров/сеттеров.
 */
@Data
@AllArgsConstructor
public class Pair<K, V> {
    private K key;
    private V value;

    void printTypes() {
        System.out.println("Тип K: " + key.getClass().getName());
        System.out.println("Тип V: " + value.getClass().getName());
        System.out.println();
    }

    void printObjectInfo() {
        System.out.println("Объект класса Pair(" + key + ", " + value + ")");
    }
}
