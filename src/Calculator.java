import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator");
/*
        int firstValue = 5;
        int secondValue = 10;
*/
        Scanner reader = new Scanner(System.in);   // tworze Scanner o nazwie 'reader' =
        // nowy Scanner (System. IN < czyli wchodzi do systemu)
        // int someValue = reader.nextInt();  << int 'someValue' = przeczytana kolejna linijka z systemu
        // System.out.println(someValue);

        /*
            1. pobrac liczby
            2. wykonac dzialanie
            3. wyswietlic wynik
            4. ladne wyswietlenie wynikow
        */

        // 1. pobranie liczb
        System.out.println("Insert first value");
        int firstValue = reader.nextInt();
        System.out.println("Insert second value");
        int secondValue = reader.nextInt();

        // 2. wykonanie dzialan
        int addResult = firstValue + secondValue;
        int subtractResult = firstValue - secondValue;
        int multiplyResult = firstValue * secondValue;
        double divideResult = 0;
        if (secondValue != 0) {
            divideResult = firstValue / (double) secondValue; // dzielenie robie za pomoca double = musze zmienic 1 wartosc
        }                                                     // tez na doubla, dlatego przed nazwa inta umieszczam (double)

        // 3. wyswietlenie wynikow
        // System.out.println("Add = " + addResult);
        // System.out.println("Subtrack = " + subtractResult);
        // System.out.println("Multiply = " + multiplyResult);
        // if (secondValue != 0) {
        //    System.out.println("Divide = " + divideResult);
        // }

        // 4. ladne wyswietlanie wynikow

        System.out.println();

        System.out.println("Add : " + firstValue + " + " + secondValue + " = " + (addResult));
        System.out.println("Subtrack : " + firstValue + " - " + secondValue + " = " + subtractResult);
        System.out.println("Multiply : " + firstValue + " * " + secondValue + " = " + multiplyResult);
        if (secondValue != 0) {
            System.out.println("Divide : " + firstValue + " / " + secondValue + " = " + divideResult);
        }

        // 5. wyswietlic info o liczbach
        // czy liczby sa rowne
        // wyswietlic wieksza liczbe
        // czy jest dzielenie z reszty
        // wyswietlic parzyste liczby

        System.out.println("first value: " + firstValue);
        System.out.println("second value: " + secondValue);
       /*
            Przenioslem to nizej do IF -> ELSE IF -> ELSE
             if (firstValue == secondValue) {
            System.out.println("Values are equal");
              } else
            System.out.println("Values are not equal");
        */

        if (firstValue > secondValue) {
            System.out.println("First value is bigger than the second one ");
        } else if (secondValue > firstValue) {
            System.out.println("Second value is bigger than the first one");
        } else {
            System.out.println("Values are equal");
        }

        if (firstValue % secondValue != 0) {
            System.out.println("Is the rest from divide: " + (firstValue % secondValue));
        } else
            System.out.println("is not the rest from divide");

        if (firstValue % 2 == 0) {
            System.out.println("first value is even");
        } else if (secondValue % 2 == 0)
            System.out.println("second value is even");

    }

}