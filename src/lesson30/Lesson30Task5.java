package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Cоздать объект класса LocalDate, представляющий собой дату 25.06.2020. Вывести полученную дату в консоль.
 */
public class Lesson30Task5 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 6, 25);
        System.out.println("Дата в формате по умолчанию: " + date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        System.out.println("Дата в формате dd.MM.YYYY: " + date.format(formatter));
    }
}
