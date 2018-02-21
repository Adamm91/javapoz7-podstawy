import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        // pobrac od usera jego wiek (liczba)
        // jezeli wiek < 6 - powinienes isc do przedszkola
        // wiek < 12 - powinienes sic do podstawowki
        // wiek < 16 - do gimnazjum
        // < 20 - srednia
        // else - uczelnia

        Scanner scanner = new Scanner (System.in);
        System.out.println("Insert your age...");
        int age = scanner.nextInt();

        if (age < 6) {
            System.out.println("You should go to the kindergarten");
        } else if (age < 12) {
            System.out.println("You should go to the Primary School");
        } else if (age < 16) {
            System.out.println("You should go to the Middle School");
        } else if (age < 20) {
            System.out.println("You should go to the High School");
        } else {
            System.out.println("You should go to the University");
        }


        if (age >= 20 && age < 30) {
            System.out.println("ciupaga");
        }

        if ( age >= 0 && (age < 18 || age >= 65) ) {
            System.out.println("gowniarz lub emeryt");
        }

        /*
            1. wyswietlic wiadomosc "a" jezeli wiek > 30 i podzielny przez 3
            2. (kolejny if) wyswietl wiadomosc "b" jezeli wiek < 15 lub > 60 i wiek / 5 ma reszte 2
         */

        if (age > 30 && age % 3 == 0) {
            System.out.println("a");
        }

        if ((age < 15 || age > 60) && age % 5 == 2 ) {
            System.out.println("b");
        }


    }
}
