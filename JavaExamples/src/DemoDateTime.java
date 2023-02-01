import java.time.*;

public class DemoDateTime {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println("date = " + d);
        LocalDate d1 = LocalDate.of(2022, Month.JUNE,22);
        System.out.println("d1 = " + d1);
        LocalTime T = LocalTime.now();
        System.out.println("T = " + T);
        LocalTime t1 = LocalTime.now(ZoneId.of("UCT"));
        System.out.println("t1 = " + t1);
        Instant i = Instant.now();
        System.out.println("i = " + i);
    }
}
