import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class CountingSundays {
    public static void main(String[] args) {
        LocalDate beginning = LocalDate.of(1901, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2000, Month.DECEMBER, 31);

        LocalDate analysed = beginning;
        long sundays = 0;
        while (analysed.compareTo(end) != 0) {
            if (analysed.getDayOfWeek() == DayOfWeek.SUNDAY && analysed.getDayOfMonth() == 1)
                sundays++;
            analysed = analysed.plusDays(1);
        }
        System.out.println(sundays);
    }
}
