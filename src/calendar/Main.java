package calendar;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        CalendarMonth calendarMonth = CalendarMonth.of("March", 2018, 3, 31, 4);

        int answer;
        do {
            System.out.println("1. Show month");
            System.out.println("2. Switch month {month numberOfDays startingWeekDay}");
            System.out.println("0. End");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    showMonth(scanner, calendarMonth);
                    break;
                case 2:
                    switchMonth(scanner);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        } while (answer != 0);

    }

    private static void switchMonth(Scanner scanner) {

    }

    private static void showMonth(Scanner scanner, CalendarMonth calendarMonth) {
        int option;
        do {
        System.out.println(calendarMonth);
        System.out.println("1. Add note, 2. Show note, 3. Remove note");
        option = scanner.nextInt();
        switch(option) {
            case 1:
                addNote(scanner, calendarMonth);
                break;
            case 2:
                showNote(scanner, calendarMonth);
                scanner.nextLine();
                scanner.nextLine();
                break;
            case 3:
                int dayNumber = scanner.nextInt();
                calendarMonth.setNoteForDay(null, dayNumber);
                break;
            default:
                option = 0;
                break;
        }
        } while (option != 0);
    }

    private static void addNote(Scanner scanner, CalendarMonth calendarMonth) {
        int dayNumber = scanner.nextInt();
        String note = scanner.nextLine();
        calendarMonth.setNoteForDay(note, dayNumber);
    }

    private static void showNote(Scanner scanner, CalendarMonth calendarMonth) {
        System.out.println("which day?");
        int numberOfDayToShow = scanner.nextInt();
        CalendarDay day = calendarMonth.getCalendarDay(numberOfDayToShow);
        if (day.hasNote()) {
            System.out.println(day.getNotes());
        } else {
            System.out.println("This day does not have any notes");
        }
    }

}


