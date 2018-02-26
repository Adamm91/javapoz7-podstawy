package piate;

public class Methods {
    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8};

        printArray(array);


        int [] newArray = new int [5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }

        printArray(newArray);

        // napisac funkcje ktora przyjmuje tablice liczb i wypisuje ich sume

        sumOfArray(array);
        sumOfArray(newArray);

        // napisac metode ktora przyjmuje tablice i wyswietla jej srednia wartosc

        avg(array);
        avg(newArray);







    }

    public static void avg (int [] array) {
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = (double)sum / array.length;
        System.out.println("Avg: " + avg);

    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void sumOfArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum of the values is: " + sum);
    }


}
