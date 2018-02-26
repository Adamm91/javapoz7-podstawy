package trzecie;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {

//         1.
//         wczytac liczbe n
//         zapytac n razy o liczbe
//         czy pdzielna przez 2 tp napisac
//         jak podzielna przez 3 to napisac(tylko 3, a nie 2 i 3)
//         jak podzielna przez 6 to napisac (tylko 6, a nie 2 i 3 tez)
//
//         2.
//         pobrac n od uzytkownika
//         pobieracie n liczb
//         info czy ta liczba byla wieksza od poprzedniej
//
//         3. odliczyc sume n parzystych liczb
//
//         * obliczyc silnie dla n

        Scanner scanner = new Scanner(System.in);
        System.out.println("zad. 1");
        System.out.println("Insert number of numbers...");
        int m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                System.out.println("Insert your " + m + " numbers");
                int n = scanner.nextInt();
                if (n % 6 == 0) {
                    System.out.println("It is divisible by 6");
                } else if (n % 3 == 0) {
                    System.out.println("It is divisible by  3");
                } else if (n % 2 == 0) {
                    System.out.println("It is divisible by 2");
                } else
                    System.out.println("It is not divisible by 2, 3 or 6");
            }

        System.out.println("zad. 2");
        System.out.println("Insert number of numbers...");
            int n = scanner.nextInt();
            int firstValue = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Insert number...");
                int m2 = scanner.nextInt();
                if (m2 > firstValue) {
                    System.out.println(m2 + " is bigger than " + firstValue);
                    firstValue = m2;
                } else if (m2 < firstValue) {
                    System.out.println(m2 + " is lower than " + firstValue);
                    firstValue = m2;
                } else  {
                    System.out.println(m2 + " is equal to " + firstValue);
                    firstValue = m2;
                }
             }


        System.out.println("zad. 3");
        System.out.println("Insert your numbers...");
        n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i % 3 != 0) {
                sum += i;

            }
        } System.out.println("Sum = " + sum);

//        System.out.println("zad. *");
//        n = scanner.nextInt();
//        int someValue = 1;
//        for (int i = 1; i <= n; i++) {
//            if (n > 0) {
//                System.out.println(i * someValue);
//                someValue = i;
//            }
//        }


    }


}
