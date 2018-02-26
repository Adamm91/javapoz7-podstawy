package czwarte;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

// 2. tablica liczb (np. 1,2,3,4,5,6) i definiujemy liczbe np. 3. dzieli nam tablice na 1,2,3 oraz 4,5,6
//	definiujemy 5 - 1,2,3,4,5 oraz 6.

        Scanner scanner = new Scanner(System.in);

        int numberOfLength; // length of the all tab
        int numberOfLastValue; // length of the first tab
        int value = 0; // value of the first position in the first tab


        System.out.println("How many numbers?");
        numberOfLength = scanner.nextInt();
        System.out.println("Insert last value of the first tab");
        numberOfLastValue = scanner.nextInt();

        int numberOfSecondTab = numberOfLength-numberOfLastValue; // length of the second tab
        int [] firstTab = new int [numberOfLastValue + 1]; // +1 because the last value have to be involved
        int [] secondTab = new int [numberOfSecondTab];

        for (int i = 0; i <= numberOfLastValue; i++) {
            firstTab [i] = value;
            value++;
        }

        for (int i = 0; i < numberOfSecondTab; i++) {
            secondTab [i] = value;
            value++;
        }



        System.out.println("First tab: " + Arrays.toString(firstTab));
        System.out.println("Second tab: " + Arrays.toString(secondTab));

    }
}
