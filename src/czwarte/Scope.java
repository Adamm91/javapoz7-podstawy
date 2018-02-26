package czwarte;

import java.util.Arrays;
import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {

        // napisac petle, ktora wyswietli wszystkie male litery 'char'

        // zrobic tablice ktora trzyma imiona



//         1. zdefiniowac tablice z kilkoma liczbami. obliczyc sume
//         2. zdefiniowac tablice z kilkoma liczbami. obliczyc srednia
//         3. zdefiniowac tablice z kilkoma liczbami. obliczyc max i min
//         4. zdefiniowac tablice z kilkoma liczbami. obliczyc ilosc elementow do wystapienia liczby ujemnej (7, 5, -4  = 2)
//         5. podwoic wartosci w tablicy
//         6. utworzyc tablice n elementowa z kolejnych liczb (np. 4 to 1, 2, 3, 4)
//         7. utworzyc tablice n elementowa tylko z parzystych liczb (np. 4 to 0, 2, 4, 6)
//         8. zapytac usera o rozmiar i utworzyc tablice z liczbami (np 5 - 5, 4, 3, 2, 1)
//         9. zapytac usera o rozmiar i umozliwic mu wstawianie elementow (np. 5 - 4, 6, 23, 754 , 214) i oblicz z nich srednia
//         10 posortowac tablice rosnoca. Ile jest elementow mniejszych od liczby

        // binaryCode();

        // wypisz kod binarny dla liczby n
        // 1. zdefiniowac tablice z kilkoma liczbami. obliczyc sume

//        int [] tab1 = {12, 46, 14, 36};
//        int sum = 0;
//        for (int i = 0; i < tab1.length; i++) {
//            sum += tab1[i];
//        }
//        System.out.println(sum);

        // 2. zdefiniowac tablice z kilkoma liczbami. obliczyc srednia

//        int [] tab1 = {12, 46, 14, 36};
//        int sum = 0;
//        int avg = 0;
//        for (int i = 0; i < tab1.length; i++) {
//            sum += tab1[i];
//            avg = sum / tab1.length ;
//        }
//        System.out.println(avg);


        // 3. zdefiniowac tablice z kilkoma liczbami. obliczyc max i min

//        int [] tab3 = {4, 8 , 654, 74, 16};
//        int maxValue = tab3[0];
//        int minValue = tab3[0];
//        for (int i = 1; i < tab3.length; i++) {
//            if (tab3[i] > maxValue) {
//                maxValue = tab3[i];
//            }
//
//            if (tab3[i] < minValue) {
//                minValue = tab3[i];
//            }
//        }
//        System.out.println("min: " + minValue);
//        System.out.println("max: " + maxValue);

        // 4. zdefiniowac tablice z kilkoma liczbami. obliczyc ilosc elementow do wystapienia liczby ujemnej (7, 5, -4  = 2)

//        int [] tab4 = {147, 45 , 84 , -1};
//
//
//        int i = 0;
//        while (i < tab4.length && tab4[i] >= 0) {
//                i++;
//        }
//        System.out.println(i);



        // 5. podwoic wartosci w tablicy

//        int [] tab6 = {1,2,3,4,5,6};
//
//        for (int i = 0; i < tab6.length; i++) {
//            tab6[i] *= 2;
//        }
//        System.out.println(Arrays.toString(tab6));



        // 6. utworzyc tablice n elementowa z kolejnych liczb (np. 4 to 1, 2, 3, 4)

//        int n = 4;
////        int[] newArray = new int[n];
////        for(int i = 0; i < newArray.length; i++) {
////            newArray[i] = i + 1;
////        }
////        System.out.println(Arrays.toString(newArray));


        // 7. utworzyc tablice n elementowa tylko z parzystych liczb (np. 4 to 0, 2, 4, 6)

//        int n = 4;
//        int [] newArray = new int [n];
//        for (int i = 0; i < newArray.length; i++) {
//            newArray[i] = i * 2;
//        }
//        System.out.println(Arrays.toString(newArray));


        // 8. zapytac usera o rozmiar i utworzyc tablice z liczbami (np 5 - 5, 4, 3, 2, 1)

//        int size = 5;
//        int [] descendingNumbers = new int [size];
//
//        for (int i = 0; i < descendingNumbers.length; i++) {
//            descendingNumbers[i] = descendingNumbers.length - i;
//        }
//        System.out.println(Arrays.toString(descendingNumbers));


        // 9. zapytac usera o rozmiar i umozliwic mu wstawianie elementow (np. 5 - 4, 6, 23, 754 , 214) i oblicz z nich srednia


//        System.out.println("Insert size of array");
////        int sizeOfUserArray = scanner.nextInt();
////        int [] userArray = new int [sizeOfUserArray];
////        int sumOfArray = 0;
////
////        for (int i = 0; i < userArray.length; i++) {
////            System.out.println("Insert next value");
////            userArray[i] = scanner.nextInt();
////            sumOfArray += userArray[i];
////        }
////        System.out.println("Avg = " + ( (double)sumOfArray / userArray.length) );



        // 10 posortowac tablice rosnoca. Ile jest elementow mnejszych od liczby


//        int [] sortedArray = {1,2,3,4,5,6,7,8,9};
//        int searchingNumber = 6;
//        int counterForSearching = 0;
//
//        while (counterForSearching < sortedArray.length && sortedArray[counterForSearching] != searchingNumber) {
//            counterForSearching++;
//
//        }
//        System.out.println("We have " + counterForSearching + " numbers smaller than " + searchingNumber);


//    }
//
//    private static void StringTabLoop() {
//        String [] names = {"Jan", "Anna", "Marek"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//    }
//
//    private static void tab() {
//        int [] array = {1,2,3,4,5,6};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println();
//        int [] emptyArray = new int [10];
//
//        emptyArray[5] = 3;
//        System.out.println(emptyArray[5]);
//        System.out.println("length: " + emptyArray.length);
//    }

//    private static void charArray() {
//        String message = "Hello World";
//        char [] messageAsCharArray = message.toCharArray();
//        System.out.println(messageAsCharArray[0]);
//        System.out.println(messageAsCharArray[1]);
//        System.out.println(messageAsCharArray[2]);
//        System.out.println(messageAsCharArray[3]);
//
//        System.out.println();
//        System.out.println();
//    }

//    private static void charAtoZ() {
//        char letter = 'a';
//        for (int i = 0; i <= 122 - 97; i++){
//            System.out.println((char)(letter + i));
//        }
//
//        for (char i = 'a'; i <= 122; i++) {
//            System.out.print(i + " ");
//        }
//    }

//



//    private static void scope() {
//        int number = 1500000000;
//        System.out.println(number + number);
//
//        System.out.println("MAX VALUE = " + Integer.MAX_VALUE);
//        System.out.println("MIN VALUE = " + Integer.MIN_VALUE);
//
//        long bigNumber = 3000000000L;
//        System.out.println("bigNumber = " + bigNumber);
//        System.out.println("MAX VALUE = " + Long.MAX_VALUE);
//        System.out.println("MIN VALUE = " + Long.MIN_VALUE);
    }

    private static void binaryCode() {
        Scanner scanner = new Scanner(System.in);
        int numberToBin = scanner.nextInt();
        int n = numberToBin;
        int digit = 0;
        int binaryCode = 0;
        int multiplier = 1;

        while (n != 0) {
            digit = n % 2;
            n /= 2;
            digit *= multiplier;
            multiplier *= 10;
            binaryCode += digit;

        }
        System.out.println(numberToBin + " = " + binaryCode);
    }
}
