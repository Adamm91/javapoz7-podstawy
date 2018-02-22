package trzecie;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // whileExample(scanner);

        // wczytujemy liczby tak dlugo az nie bedize ona podzielna przez 15 i wypisac ta liczbe;

        // wczutujemy liczby tak dlugo az ktos nie poda 0. wyswietlamy sume podanych elementow
        // boolean result = true;

        int number = 1;

        while (number % 15 != 0) {
            System.out.println("insert value");
            number = scanner.nextInt();
        }
        System.out.println("Number = " + number);

        int sum = 0;
        boolean result = true;
        while (result) {
            System.out.println("Insert number");
            int number2 = scanner.nextInt();
            sum += number2;
//            if (number2 == 0)
//                result = false;
            result = number2 != 0; // to jest to samo co wyzej, tylko zgrabniejsze
        } System.out.println("sum = " + sum);


    }

    private static void whileExample(Scanner scanner) {
        int sum = 10;
        int tmp = 0;
        int i = 0;
        while (tmp < sum) {
            int value = scanner.nextInt();
            i++;
            tmp += value;
        }
        System.out.println("Inserted " + i + " numbers.");
    }
}
