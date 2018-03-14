package someUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User [] users = new User[10];
        int answer;
        do {
            System.out.println("1. show");
            System.out.println("2. add");
            System.out.println("3. delete");
            System.out.println("0. exit");
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    showUserView();
                    showUser(users);
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

    private static void deleteUser(Scanner scanner, User [] users) {
        System.out.println("Insert ID to delete");
        int ID = scanner.nextInt();
        int i = 0;
        while (i < users.length) {
            if (ID == users[i].getID()) {
                users[i] = null;
                for (int j = i; j < users.length - 1; j++) {
                    users[j] = users[j + 1];
                }
                break;
            } else {
                i++;
            }
        }
    }

    private static void addUser(Scanner scanner, User [] users) {
        System.out.println("Insert first name");
        String firstName = scanner.nextLine();
        System.out.println("Insert last name");
        String lastName = scanner.nextLine();
        System.out.println("Insert age");
        int age = scanner.nextInt();
        System.out.println("Insert ID");
        int ID = scanner.nextInt();
        User user = new User(firstName, lastName, age, ID);

        int i = 0;
        while (i < users.length) {
            if (users[i] == null) {
                users [i] = user;
                break;
            } else {
                i++;
            }
        }
    }

    private static void showUser(User [] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println(users[i]);
            }
        }
    }

    public static void showUserView() {
        System.out.println("** Users list **");
        System.out.println();
    }

    public static void addUserView() {
        System.out.println("** Add User **");
        System.out.println();
    }

    public static void deleteUserView() {
        System.out.println("** Delete User **");
        System.out.println();
    }
}
