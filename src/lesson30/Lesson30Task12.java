package lesson30;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Написать свою реализацию интерфейса TemporalAdjuster, которая бы изменяла дату на ближайшее (в днях) 1 января.
 */
public class Lesson30Task12 {
    public static void main(String[] args) {
        LocalDate dateNearsFirstJanuary = LocalDate.now().with(new NearestFirstJanuary());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM YYYY");
        System.out.println("Ближайшее к сегодняшней дате: " + formatter.format(dateNearsFirstJanuary));
    }
}
