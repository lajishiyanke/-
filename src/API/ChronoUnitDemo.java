package API;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime today=LocalDateTime.now();
        LocalDateTime d=LocalDateTime.of(1999,11,9,0,0);
        System.out.println(ChronoUnit.YEARS.between(d,today));
        System.out.println(ChronoUnit.DAYS.between(d,today));
    }
}
