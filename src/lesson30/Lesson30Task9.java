package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.DAYS;

/*
Создать объект LocalDate, представляющий собой сегодняшнюю дату. Создать объект LocalDate, представляющий собой дату
25.06.2020. Используя созданные объекты, найти количество дней между этими двумя датами.
*/

public class Lesson30Task9 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2020, 6, 25);
        long days = DAYS.between(today, futureDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("До " + formatter.format(futureDate) + " осталось " + days + " дней.");
    }
}
