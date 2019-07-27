package lesson30;
/*
Написать свою реализацию интерфейса TemporalAdjuster, которая бы прибавляла к дате 42 дня
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Lesson30Task11 {
    public static void main(String[] args) {
        LocalDate datePlus42 = LocalDate.now().with(new ForwardInDateAdjuster());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM YYYY");
        System.out.println("Через 42 дня наступит: " + formatter.format(datePlus42));
    }
}
