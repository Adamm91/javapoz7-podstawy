package user;

import java.util.Arrays;
import java.util.Scanner;

public class UserStorage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int answer;
        User[] users = new User[10];

        do {
            menuView();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    showListView();
                    showUsers(users);
                    scanner.nextLine();
                    break;
                case 2:
                    addUserView();
                    addUser(scanner, users);
                    break;
                case 3:
                    deleteUserView();
                    deleteUser(scanner, users);
                    break;
            }
        } while (answer != 0);


    }

    public static void deleteUserView() {
        System.out.println("** Usun user'a **");
        System.out.println();
    }

    public static void addUserView() {
        System.out.println("** Dodaj user'a **");
        System.out.println();
    }

    public static void showListView() {
        System.out.println("** User list **");
        System.out.println();
    }

    public static void menuView() {
        System.out.println("1. wyswietl");
        System.out.println("2. dodaj");
        System.out.println("3. usun");
        System.out.println("0. koniec");
    }

    private static void addUser(Scanner scanner, User[] users) {
        System.out.println("Insert first name");
        String firstName = scanner.nextLine();
        System.out.println("Insert last name");
        String lastName = scanner.nextLine();
        System.out.println("Insert pesel");
        int pesel = scanner.nextInt();

        User user = new User(firstName, lastName, pesel);

        int i = 0;
        while (i < users.length) {
            if (users[i] != null) {
                i++;
            } else {
                users[i] = user;
                break;
            }
        }
        System.out.println("Dodano pomyslnie");
    }

    private static void deleteUser(Scanner scanner, User[] users) {
        System.out.println("Write which pesel to delete");
        int pesel = scanner.nextInt();
        int i = 0;
        while (i < users.length) {
            if (users[i].getPesel() == pesel) {
                users[i] = null;
                for (int j = i; j < users.length - 1; j++) {
                    users[j] = users[j + 1];
                }
                break;
            } else {
                i++;
            }
        }
        System.out.println("element usuniety");
    }

    private static void showUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i]);
            }
        }
    }

    public static String capitalize(String message) {
        char[] chars = message.toCharArray();
        if (chars[0] >= 'a' && chars[0] <= 'z') {
            chars[0] = (char) (chars[0] - 32);
        }
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        String capitalized = new String(chars);
        return capitalized;
    }

}
