package czwarte;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {

//         zad. 1 napisac petle ktora odwraca liczbe np. 12345 -> 54321, 1200 -> 21
//         zad. 2 wczytujemy n liczb, i sumujemy wszystkie cyfry 123, 456 -> 1+2+3+4+5+6 = 21
//         zad. 3 pozbyc sie wszystkich 0 z liczby np. 120002 -> 122


        // zad. 1 napisac petle ktora odwraca liczbe np. 12345 -> 54321, 1200 -> 21


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Insert your number...");
//
//
//        int reversedNumber = 0;
//        int number = 123456;
//        while (number != 0) {
//            int digit = number % 10;
//            reversedNumber *= 10;
//            reversedNumber += digit;
//            number /= 10;
//        }
//        System.out.println("Reserved number = " + reversedNumber);
//




        // zad. 2 wczytujemy n liczb, i sumujemy wszystkie cyfry 123, 456 -> 1+2+3+4+5+6 = 21



//        System.out.println("Insert number of numbers...");
//
//        int n = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Write your number...");
//            int value = scanner.nextInt();
//
//            while (value != 0) {
//                int digit = value % 10;
//                sum += digit;
//                value /= 10;
//            }
//        }System.out.println(sum);

        // zad. 3 pozbyc sie wszystkich 0 z liczby np. 120002 -> 122


        System.out.println("Write your number");
        int numberWithZeros = scanner.nextInt();
        int numberWithoutZeros = 0;
        int multiplier = 1;
        while (numberWithZeros != 0) {
            int digit = numberWithZeros % 10;
            if (digit != 0) {
                numberWithoutZeros += digit * multiplier;
                multiplier *= 10;
            }
            numberWithZeros /= 10;
        }
        System.out.println("Number without zeros = " + numberWithoutZeros);








    }



}
