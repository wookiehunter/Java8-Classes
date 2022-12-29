import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate LD1 = LocalDate.now();
        LocalTime LT1 = LocalTime.now();
        System.out.println(LD1 + " " + LT1);

        LocalDateTime LDT1 = LocalDateTime.now();
        ZonedDateTime ZDT1 = ZonedDateTime.now();
        System.out.println(LDT1 + " " + ZDT1);

        LD1 = LocalDate.of(1976, 11,03);
        LT1 = LocalTime.of(23,0,01);
        System.out.println(LD1 + " " + LT1);

        LDT1 = LocalDateTime.of(1976,11,03,11,30);
        System.out.println(LDT1);

        ZDT1 = ZonedDateTime.of(1976,11,03,
                11,30,00,00,
                ZoneId.of("Europe/London"));
        System.out.println(ZDT1);

        // Calculate
        LocalDate LD3 = LD1.plusDays(3);
        System.out.println(LD3);
        LocalDate LD4 = LD1.plusYears(46);
        System.out.println(LD4);

        LocalTime LT2 = LT1.plusHours(4);
        System.out.println(LT2);
        LocalTime LT3 = LT1.minusHours(4);
        System.out.println(LT3);

        LocalDate LD5 = LocalDate.of(1976, 11,03);
        LocalDate LD6 = LocalDate.of(1976, 11,03);
        System.out.println(LD5.equals(LD6)); // true

        LD6 = LD6.plusDays(3);
        System.out.println(LD6.isAfter(LD5)); // true
        System.out.println(LD6.isBefore(LD5)); // false

        // Period
        Period period = Period.between(LD5, LD6);
        System.out.println(period.getDays());

        LocalTime LT4 = LocalTime.now();
        LocalTime LT5 = LT4.plusHours(4);

        Duration duration = Duration.between(LT4, LT5);
        System.out.println(duration.getSeconds()/3600);

        // Formats
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");
        String stuff = LDT1.format(pattern);
        System.out.println(stuff);



    }
}
