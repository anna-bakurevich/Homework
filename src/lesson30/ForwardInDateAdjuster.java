package lesson30;

import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ForwardInDateAdjuster implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return temporal.plus(42, ChronoUnit.DAYS);
    }
}
