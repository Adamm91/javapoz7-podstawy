package wisielec;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class randomApplication {
    public static void main(String[] args) {

        // nowa tablica n elementowa zlozona z losowych liczb
        // nowa tablica o wielkosci zdefinioweanej przez usera elementowa zlozona z losowych liczb z zakresu podanego przez usera
        // suma losowych elementow
        // metoda symulujaca rzut kostka do gry (1-6)
        // TODO: napisac jeszcze raz generowanie liczb
        // TODO: wygenerowac 10 losowych liczb parzystych z zakresu 0-10 wlacznie



        System.out.println("zad 1.");
        System.out.println(Arrays.toString(randomArray()));
        System.out.println();
        System.out.println("zad 2.");
        System.out.println(Arrays.toString(userArray()));
        System.out.println();
        System.out.println("zad 3.");
        System.out.println("sum = " + sum(userArray()));
        System.out.println();
        System.out.println("zad 4.");
        System.out.println("Random number is: " + dice());
        System.out.println();
        System.out.println("zad 5.");
        System.out.println("Even numbers from 0 to 10");
        randomArrayEvenNumbers();


    }

    public static void randomArrayEvenNumbers () {
        int[] array =  new int [10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6) * 2;
        }
        System.out.println(Arrays.toString(array));
    }

    public static int [] randomArray() {
        int n = 10;
        Random random = new Random(n);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    public static int [] userArray() {
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify size");
        int index = scanner.nextInt();
        System.out.println("Specify bound");
        int firstValue = scanner.nextInt();
        System.out.println("Specify offset");
        int lastValue = scanner.nextInt();

        int[] arrayOfUser = new int[index];

        for (int i = 0; i < arrayOfUser.length; i++) {
            arrayOfUser[i] = threadLocalRandom.nextInt(firstValue, lastValue);
        }
        return arrayOfUser;
    }

    public static int sum (int [] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        return sum;
    }

    public static int dice () {
        Random random = new Random();
        int dice = random.nextInt();
        dice = (random.nextInt(6) + 1 );
        return dice;
    }
}
