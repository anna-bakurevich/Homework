package lesson17;
/*
Дан класс Person с полями firstName, lastName, age.
Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson17Task5 {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Наоми", "Кемпбелл", 49));
        personList.add(new Person("Кейт", "Мосс", 45));
        personList.add(new Person("Синди", "Кроуфорд", 53));
        personList.add(new Person("Клаудия", "Шиффер", 48));
        personList.add(new Person("Линда", "Евангелиста", 54));
        personList.add(new Person("Хайди", "Клум", 46));

        String fullNameAge = personList.stream()
                //фильтруем поток по объектам, у которых сумма длин имен менее 15
                .filter((person) -> (person.getFirstName() + person.getLastName()).length() < 15)
                //сортируем по возрасту в порядке убывания
                .sorted(Comparator.comparing(Person::getAge).reversed())
                //преобразуем элементы потока в строки, состоящие из обоих имен
                .map(person -> person.getFirstName() + " " + person.getLastName())
                //получаем значение первого элемента
                .findFirst().get();

        System.out.println("Самый старший человек с длиной полного имени менее 15 символов: " + fullNameAge);
    }
}
