package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Создать объект LocalDate, представляющий собой сегодняшнюю дату. Преобразовать дату в строку вида "05.05.2017".
Вывести эту строку в консоль.
 */
public class Lesson30Task7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String dateNewFormat = date.format(DateTimeFormatter.ofPattern("dd.MM.YYYY"));
        System.out.println("Сегодняшняя дата в формате dd.MM.YYYY: " + dateNewFormat);
    }
}
