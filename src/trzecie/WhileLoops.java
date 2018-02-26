package trzecie;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // whileExample(scanner);

        // wczytujemy liczby tak dlugo az nie bedize ona podzielna przez 15 i wypisac ta liczbe;

        // wczutujemy liczby tak dlugo az ktos nie poda 0. wyswietlamy sume podanych elementow
        // boolean result = true;

        // whileLoopExercises(scanner);

        /*
            Zad 1. podajemy liczby az nie zostanie podane 0. wypisujemy najwieksza liczbe.
            zad 2. sprawdzanie ilosci cyfr. np 12345 = 5 (dzielimy przez 10, potem przez 10, az do ilosci cyfr)
            zad 3. suma cyfr liczby np 123 = 6 (1+2+3) (% i dzielenie)
            zad 4. ilosc podanej cyfry w liczbie
            zad 5. wypisac dzielnik liczby (6 - 1, 2, 3, bez ostatniej)
            zad 6. sprawdzic czy liczba jest pierwsza (podzielna tylko przez sama siebie)
            zad 7. menu (1.nowa gra, 2. wczytaj, 3.samouczek, 0.koniec)
         */


        // Zad 1. podajemy liczby az nie zostanie podane 0. wypisujemy najwieksza liczbe.

//        int value = 1;
//        int biggest = 0;
//        while (value != 0) {
//            System.out.println("Insert your numbers...");
//            value = scanner.nextInt();
//            if (value > biggest) {
//                biggest = value;
//            }
//        }
//        System.out.println("End of the program. The biggest number was: " + biggest);

        // zad 2. sprawdzanie ilosci cyfr. np 12345 = 5 (dzielimy przez 10, potem przez 10, az do ilosci cyfr)

//        int numberOfDigit = 0;
//        int nextNumber;
//        System.out.println("Insert your number...");
//        int n = scanner.nextInt();
//        if (n == 0) {
//          numberOfDigit++;
//        }
//        while (n != 0) {
//            numberOfDigit++;
//            n /= 10;
//
//        }
//        System.out.println(numberOfDigit);





        //  zad 3. suma cyfr liczby np 123 = 6 (1+2+3) (% i dzielenie)

//        System.out.println("Insert number...");
//        int n = scanner.nextInt();
//        int sum = 0;
//
//        while (n != 0) {
//           sum += n % 10;
//            n /= 10;
//        }
//        System.out.println("Sum of digits: " + sum);


        // zad 4. ilosc podanej cyfry w liczbie

//        int anotherNumber = 2223;
//        int searchForNumber = 2;
//        int counter = 0;
//        while (anotherNumber != 0) {
//            int nextNumber = anotherNumber % 10;
//            if (nextNumber == searchForNumber) {
//                counter++;
//            }
//            anotherNumber /= 10;
//        }
//        System.out.println(counter);








        // zad 5. wypisac dzielnik liczby (6 - 1, 2, 3, bez ostatniej)
//
//        System.out.println("Insert number...");
//        int n = scanner.nextInt();
//        int i = 1;
//        while (i <= n / 2 ) {
//            if (n % i == 0)
//                System.out.println("Divider: " + i);
//            i++;
//        }

            // zad 6. sprawdzic czy liczba jest pierwsza (podzielna tylko przez sama siebie)

//        System.out.println("Insert your number...");
//        int n = scanner.nextInt();
//        int i = 2;
//        boolean isPrimary = true;
//        while (isPrimary && i <= n / 2) {
//            if (n % i == 0) {
//                isPrimary = false;
//            }
//            i++;
//        }
//        if (isPrimary) {
//            System.out.println("Number is primary");
//        } else {
//            System.out.println("Number is not primary");
//        }

        // zad 7. menu (1.nowa gra, 2. wczytaj, 3.samouczek, 0.koniec)

//        int option = 1;
//       while (option != 0) {
//           System.out.println("1. New");
//           System.out.println("2. Load");
//           System.out.println("3. About");
//           System.out.println("0. Quit");
//           option = scanner.nextInt();
//           System.out.println();
//           System.out.println();
//           System.out.println();
//           System.out.println();
//
//       }
//    }





//
//    private static void whileLoopExercises(Scanner scanner) {
//        int number = 1;
//
//        while (number % 15 != 0) {
//            System.out.println("insert value");
//            number = scanner.nextInt();
//        }
//        System.out.println("Number = " + number);
//
//        int sum = 0;
//        boolean result = true;
//        while (result) {
//            System.out.println("Insert number");
//            int number2 = scanner.nextInt();
//            sum += number2;
////            if (number2 == 0)
////                result = false;
//            result = number2 != 0; // to jest to samo co wyzej, tylko zgrabniejsze
//        }
//        System.out.println("sum = " + sum);
//    }
//
//    private static void whileExample(Scanner scanner) {
//        int sum = 10;
//        int tmp = 0;
//        int i = 0;
//        while (tmp < sum) {
//            int value = scanner.nextInt();
//            i++;
//            tmp += value;
//        }
//        System.out.println("Inserted " + i + " numbers.");
    }
}
