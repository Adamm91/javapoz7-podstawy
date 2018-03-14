package moreless;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MoreLessApplication {
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
                    System.out.println("Press any key");
                    scanner.nextLine();
                    newGame();
                    break;
                case 2:
                    rulesView();
                    break;
                case 3:
                    botGame();
                    break;
                case 4:
                    stupidBot();
                    break;
                case 5:
                    stupidBot100();
                    break;
            }
        } while (answer != 0);
        endGame();

    }

    private static void stupidBot100() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += dummyBotAlgorithm(60);
        }
        System.out.println("avg: " + sum / 100);
    }

    private static int stupidBot() {
        System.out.println("System wylosowal liczbe");
        System.out.println("Podaj swoja liczbe");
        System.out.println();
        Random random = new Random();
        int number = random.nextInt(101);
        int result = 0;
        int userNumber = -1;
        while (userNumber != number) {
            userNumber = random.nextInt(101);
            System.out.println(userNumber);
            if (userNumber < number) {
                System.out.println("Za malo");
            } else if (userNumber > number) {
                System.out.println("Za duzo");
            }
            result++;
        }
            System.out.println("Liczba prawidlowa");
            System.out.println("Wynik to: " + result);
            System.out.println();
        return result;
    }

    private static int dummyBotAlgorithm(int secretNumber) {
        int userNumber = -1;
        Random random = new Random();
        int sum = 0;
        while (userNumber != secretNumber) {
            userNumber = random.nextInt(101);
            sum++;
        }
        return sum;
    }

    private static void newGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("System wylosowal liczbe");
        System.out.println("Podaj swoja liczbe");
        System.out.println();
        Random random = new Random();
        int number = random.nextInt(101);
        int result = 1;
        int userNumber = -1;

        while (userNumber != number) {
            userNumber = scanner.nextInt();
            if (userNumber < number) {
                System.out.println("Za malo");
            } else if (userNumber > number) {
                System.out.println("Za duzo");
            } else {
                System.out.println("Liczba prawidlowa");
                System.out.println("Wynik to: " + result);
            }
            result++;
        }
        System.out.println();
    }

    private static void botGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("System wylosowal liczbe");
        System.out.println("Podaj swoja liczbe");
        System.out.println();
        Random random = new Random();
        int number = random.nextInt(101);
        int result = 1;
        int botNumber;
        int minNumber = 0;
        int maxNumber = 100;
        botNumber = random.nextInt(101);
        while (botNumber != number) {
            System.out.println(botNumber);
            if (botNumber < number) {
                System.out.println("Za malo");
                if (minNumber < botNumber) {
                    minNumber = botNumber;
                }
            } else if (botNumber > number) {
                System.out.println("Za duzo");
                if (maxNumber > botNumber) {
                    maxNumber = botNumber;
                }
            }
            result++;
            botNumber = ThreadLocalRandom.current().nextInt((minNumber), (maxNumber));
        }
        System.out.println(botNumber);
        System.out.println("Liczba prawidlowa");
        System.out.println("Wynik to: " + result);
        System.out.println();
    }

    public static void endGame() {
        System.out.println("**************");
        System.out.println("* KONIEC GRY *");
        System.out.println("**************");
        System.out.println();
    }

    public static void newGameView() {
        System.out.println("************");
        System.out.println("* NOWA GRA *");
        System.out.println("************");
        System.out.println();
    }

    public static void menuView() {
        System.out.println("1. Nowa gra");
        System.out.println("2. Zasady gry");
        System.out.println("3. Bot");
        System.out.println("4. Glupi Bot");
        System.out.println("5. Glupi Bot - 100x statistic");
        System.out.println("0. Koniec");
    }

    public static void rulesView() {
        System.out.println("**************");
        System.out.println("* ZASADY GRY *");
        System.out.println("**************");
        System.out.println();
        System.out.println("Gra polega na wylosowaniu przez komputer dowolnej liczby, nastepnie gracz " +
                "musi zgadnac jaka to liczba. Wynikiem jest proba w ktorej sie udalo.");
        System.out.println();
    }


}
