package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Дана строка вида "26-03-2014". Получить объект LocalDate, представляющий собой дату, полученную из этой строки.
*/
public class Lesson30Task8 {
    public static void main(String[] args) {
        String dateString = "26-03-2014";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println("Объект LocalDate в формате по умолчанию: " + date);
        System.out.println("Объект LocalDate в формате исходной строки: " + formatter.format(date));
    }
}
