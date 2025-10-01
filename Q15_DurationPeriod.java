// Q15: Duration and Period
// Java example (requires Java 8 or later)

import java.time.*;
public class Q15_DurationPeriod {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2020,1,1);
        LocalDate d2 = LocalDate.of(2021,3,5);
        Period p = Period.between(d1, d2);
        System.out.println(p); // P1Y2M4D (1 year, 2 months, 4 days)
        Instant t1 = Instant.now();
        Instant t2 = t1.plusSeconds(3600);
        System.out.println(Duration.between(t1,t2)); // PT1H
    }
}
