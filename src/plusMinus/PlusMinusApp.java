package plusMinus;

import java.util.Random;
import java.util.Scanner;

public class PlusMinusApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            menuView();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    newGameView();
                    System.out.println("Press any key to continue");
                    scanner.nextLine();
                    System.out.println("Wynik : " + game(scanner));
                    break;
                case 2:
                    rulesView();
                    scanner.nextLine();
                    break;
            }
        } while (answer != 0);


    }

    public static int game(Scanner scanner) {
        System.out.println("Podaj liczbe z zakresu 1 - 100");
        int userNumber = 0;
        int result = 0;
        int random = randomNumber();
        while (userNumber != random) {
            userNumber = scanner.nextInt();
            if (userNumber > random) {
                System.out.println("za duzo");
            } else if (userNumber < random) {
                System.out.println("za malo");
            } else {
                System.out.println("Liczba prawidlowa");
            }
            result++;
        }
        return result;
    }

    public static void rulesView() {
        System.out.println("*** ZASADY GRY ***");
        System.out.println();
        System.out.println("gra polega na ... ");
        System.out.println();
    }

    public static void menuView() {
        System.out.println("1. Nowa gra");
        System.out.println("2. Zasady");
        System.out.println("0. Koniec");
    }

    public static void newGameView() {
        System.out.println("*** NOWA GRA ***");
        System.out.println();
        System.out.println("System wylosowal liczbe");
        System.out.println();
    }

    public static int randomNumber () {
        Random random = new Random();
        int secretNumber = random.nextInt(100 + 1);
        return secretNumber;
    }




}




