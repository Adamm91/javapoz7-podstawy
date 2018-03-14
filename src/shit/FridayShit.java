package shit;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class FridayShit {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Scanner scanner = new Scanner(System.in);
        showDate(date);


    }

    public static void showDate(LocalDate date) {
        System.out.println(
                date.getYear()
                        + " " + date.getMonth()
                        + " " + date.getDayOfMonth()
                        + ", day of year: " + date.getDayOfYear()
        );
    }
}


