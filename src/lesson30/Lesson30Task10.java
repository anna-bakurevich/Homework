package lesson30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.SECONDS;

/*
Даны два объекта LocalDate из предыдущего задания. Подсчитать количество секунд между полуночью первой даты и полуночью
второй даты.
*/

public class Lesson30Task10 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDate.now().atStartOfDay();
        LocalDateTime futureDate = LocalDate.of(2020, 6, 25).atStartOfDay();
        long seconds = SECONDS.between(today, futureDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.printf("До " + formatter.format(futureDate) + " осталось %,d секунд.", seconds);
    }
}
