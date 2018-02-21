import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        /*
            napisz program ktory pobierze informacje od uzytkownika o bokach trojkata prostokatnego,
            nastepnie wyswietli jego pole oraz obwod

            wyswietl ze trojkat nie jest prostokatny
            wyswietl srednia dlugosc boku

            sprawdz czy spelnia twierdzenie pitagorasa (a2 + b2 = c3)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert first value");
        int valueA = scanner.nextInt();
        System.out.println("Insert second value");
        int valueB = scanner.nextInt();
        System.out.println("Insert third value");
        int valueC = scanner.nextInt();

        double area = 0.5 * (double)valueA * (double)valueB;
        int circuit = valueA + valueB + valueC;

        if (valueA + valueB > valueC && valueA + valueC > valueB && valueB + valueC > valueA &&
                Math.pow(valueA, 2) + Math.pow(valueB, 2) == Math.pow(valueC, 2) ) {
            System.out.println("Area = " + area);
            System.out.println("Circuit = " + circuit);
        } else
            System.out.println("This values are not correct");

        double avg = circuit / 3.0;
        System.out.println("Avg length of side = " + avg);





    }
}
