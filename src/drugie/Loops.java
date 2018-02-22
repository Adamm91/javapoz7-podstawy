package drugie;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
           1. wyswietlic kolejne n liczb * 2 (2, 4, 6...)
           2. wyswietlic tylko parzyste liczby od 1 do n
           3. wyswietlic tylko liczby podzielne przez 3
           4. wyswietlic n liter "a"
           5. wyswietlic potegi liczb az do n
           *. obliczyc sume n liczb ( 1 + 2 + 3 + 4 + ... )

        */

        // 1. wyswietlic kolejne n liczb * 2 (2, 4, 6...)

        Scanner scanner = new Scanner(System.in);
        System.out.println("zad. 1");
        int n = scanner.nextInt();
        int number = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(number);
            number += 2;
        }

        // 2. wyswietlic tylko parzyste liczby od 1 do m
        System.out.println("zad. 2");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        // 3. wyswietlic tylko liczby podzielne przez 3

        System.out.println("zad. 3");
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }

        //  4. wyswietlic n liter "a"

        System.out.println("zad. 4");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

                System.out.println("a");
            }

        // 5. wyświetlić potęgi liczb do n
        System.out.println("zad. 5");
        n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i + " ^ 2 = " + 8);

            }



            // *. obliczyc sume n liczb ( 1 + 2 + 3 + 4 + ... )

            System.out.println("zad. *");
            n = scanner.nextInt();
            int suma = 0;
            for (int i = 1; i <= n; i++) {
                suma += i;
                System.out.println(suma);
            }





            // forLoopExample();

        }

        private static void forLoopExample() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert number of elements to multiply");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();

            if (number >= 5 && number <= 20) {
                System.out.println((i + 1) + ". Pow (" + number + ") = " + (number * number));
            } else {
                System.out.println("Number not supported. Upgrade to full version.");
            }
        }
        System.out.println("End of the program");
    }

}
