// Q14: LocalDate example
// Java example (requires Java 8 or later)

import java.time.*;
public class Q14_LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate future = today.plusDays(10);
        System.out.println("Today: " + today);
        System.out.println("Days between: " + java.time.temporal.ChronoUnit.DAYS.between(today, future)); // 10
    }
}
