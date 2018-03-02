package piate;

public class Methods {
    public static void main(String[] args) {

        int [] array = {-2,1,2,4,2,3,2,4};

        printArray(array);


//         napisac funkcje ktora przyjmuje tablice liczb i wypisuje ich sume
//         napisac metode ktora przyjmuje tablice i wyswietla jej srednia wartosc
//         napisac metode ktora zwraca wartosc najwiekszego elementu
//         napisac metode ktora zwraca wartosc najmniejszego elementu
//         rozpietosc
//         informacje o wystapieniach liczb
//         mediana
//         * na podstawie poprzednich metod wypisac posortowana tablice

        System.out.println("sum: " + sumOfArray(array));
        System.out.println("avg: " + avg(array));
        System.out.println("max value = " + maxValue(array));
        System.out.println("min value = " + min(array));
        System.out.println("spread: " + spread(array));
        printArray(statsOfOccureneces(array));
        System.out.println("Moda = " + moda(array));
        System.out.println(sortByCounting(array));




    }

    public static int [] sortByCounting (int [] array) {
        int [] sortedArray = new int [array.length];
        int [] stats = statsOfOccureneces(array);
        int k = 0;
        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < stats[i]; j++) {
                sortedArray[k] = i + min(array);
                k++;
            }
        }
        return sortedArray;
    }

    public static int indexOfMax (int [] array) {
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax] )
                iMax = i;
        }
        return iMax;
    }

    public static int moda (int [] array) {
        int [] stats = statsOfOccureneces(array);
        int indexOfMaximumValue = indexOfMax(stats);

        return indexOfMaximumValue + min(array);
    }

    public static int [] statsOfOccureneces (int[] array) {
        int[] statsArray = new int[spread(array)];
        int min = min(array);
        for (int i = 0; i < array.length; i++) {
            statsArray[array[i] - min]++;
        }
        return statsArray;
    }

    public static int spread(int[] array) {
            return maxValue(array) - min(array) + 1;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int maxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static double avg (int [] array) {
        int sum = sumOfArray(array);
        return (double) sum / array.length;
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

    public static int sumOfArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
       return sum;
    }


}
