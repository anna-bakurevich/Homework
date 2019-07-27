package lesson30;

import java.time.LocalDate;

/*
Создать объект LocalDate, представляющий собой сегодняшнюю дату. Используя этот объект, создать другой объект LocalTime,
представляющий собой дату через 3 месяца после сегодняшней. Вывести эту дату в консоль.
 */
public class Lesson30Task6 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Сегодня: " + today);
        LocalDate todayPlus3Months = today.plusMonths(3);
        System.out.println("Через три месяца наступит: " + todayPlus3Months);
    }
}
