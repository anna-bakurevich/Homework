package lesson30;

import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoUnit.DAYS;

public class NearestFirstJanuary implements TemporalAdjuster {

    //метод преобразует дату в ближайшее (по дням) 1 января
    @Override
    public Temporal adjustInto(Temporal temporal) {

        //даты 1 января текущего и следующего годов
        Temporal next = temporal.with(TemporalAdjusters.firstDayOfNextYear());
        Temporal previous = temporal.with(TemporalAdjusters.firstDayOfYear());

        //кол-во дней от текущей даты до 1 января текущего и следующего годов
        long daysToNext = DAYS.between(temporal, next);
        long daysToPrevious = DAYS.between(previous, temporal);

        //если до 1 января следующего года осталось меньше дней, чем прошло с 1 января текущего года,
        //то возвращаем 1 января следующего года, иначе - 1 января текущего года
        if (daysToNext <= daysToPrevious) {
            return next;
        } else {
            return previous;
        }
    }
}
