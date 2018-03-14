package todos;

import java.util.Arrays;
import java.util.Scanner;

public class Todos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int answer;
        String[] todos = new String[10];
        do {
            TodosViews.menuView();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    TodosViews.dodajView();
                    index = Todos.dodaj(todos, index);
                    break;
                case 2:
                    TodosViews.wyswietlView();
                    Todos.wyswietl(todos);
                    scanner.nextLine();
                    break;
                case 3:
                    TodosViews.usunView();
                    Todos.usun(todos);
                    break;
                case 4:
                    start(todos);
                    break;
//                case 5:
//                    stop(todos);
//                    break;
            }
        } while (answer != 0);



    }

//    private static void stop(String[] message) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj numer indexu");
//        int index = scanner.nextInt();
//        if([0] != 'x') {
//            System.out.println("Index nieprawidlowy");
//        } else {
//
//        }
//
//    }

    private static void start(String [] message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer indexu");
        int index = scanner.nextInt();
        message[index] = "x " + message[index];
    }

    public static int dodaj(String [] todosArray, int nextIndex) {
        Scanner stringScanner = new Scanner(System.in);
        String newTodos = stringScanner.nextLine();
        todosArray [nextIndex] = newTodos;
        return nextIndex + 1;
    }

    public static void wyswietl(String [] message) {
        for (int i = 0; i < message.length; i++) {
            if (message[i] != null) {
                System.out.print(message[i] + " ");
            }
        }
        System.out.println();
    }

    public static void usun (String [] message) {
        Scanner index = new Scanner(System.in);
        int indexToDel = index.nextInt();
        message [indexToDel] = null;
        for (int i = indexToDel; i < message.length - 1; i++) {
            message[i] = message[i + 1];
        }
    }


}
