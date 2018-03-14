package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class LocalDateTest {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        showLocalDate(now);

        LocalDate yesterday = now.minusDays(1);
        showLocalDate(yesterday);

        System.out.println(counter);


    }

    private static int counter = 0;

    public static void nameOfFirstDayOfMonth () {
        LocalDate now = LocalDate.now();
        int firstDay = now.getDayOfMonth() - 1;
        System.out.println(now.minusDays(firstDay).getDayOfWeek());
    }

    private static void showLocalDate(LocalDate now) {
        counter++;
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println(now.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()));
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfWeek().getValue());
    }
}
