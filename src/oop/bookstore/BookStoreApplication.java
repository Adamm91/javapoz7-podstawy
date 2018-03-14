package oop.bookstore;

import java.util.Scanner;

public class BookStoreApplication {
    public static void main(String[] args) {

        // TODO: todos obiektowy. status, name, date(yyyy-mm-dd), owner(name + last),

        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        Author[] authors = new Author[5];
        int answer;
        do {
            menuView();
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    authorsView();
                    authorsList(scanner, new Author[]{
                            new Author("Henryk Sienkiewicz"),
                            new Author("Adam Mickiewicz")
                    });
                    System.out.println();
                    break;
                case 2:
                    booksView();
                    bookList(scanner, new Book[]{
                            new Book("abcd", 1950),
                            new Book("12345", 1234)
                    });
                    System.out.println();
                    break;
            }
        } while (answer != 0);
        endView();

    }


    private static void list (Object [] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println((i + 1) + ". " + String.valueOf(bookList[i]));
        }
    }

    private static void bookList(Scanner scanner, Book[] books) {
        list(books);
        System.out.println("press any key...");
        scanner.nextLine();
    }

    private static void authorsList(Scanner scanner, Author[] authors) {
        list(authors);
        System.out.println("press any key...");
        scanner.nextLine();
    }

    private static void menuView() {
        System.out.println("1. Authors");
        System.out.println("2. Books");
        System.out.println("0. Exit");
    }

    private static void authorsView() {
        System.out.println("*** Authors ***");
        System.out.println();
    }

    private static void booksView() {
        System.out.println("*** Books ***");
        System.out.println();
    }

    private static void endView() {
        System.out.println("*** End of the program ***");
    }


}
