package oop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = createUser(scanner);

        Address address = new Address();
      //  address.city = "Poznan";
        address.street = "Polwiejska";
        address.country = "Polska";
        address.number = 12;
        address.postCode = "60-630";

        user.address = address;
        user.introduceYourself();
    }

    public static User createUser (Scanner scanner) {
        User user = new User();

        System.out.println("Insert first name");
        user.firstName = scanner.nextLine();

        System.out.println("Insert last name");
        user.lastName = scanner.nextLine();

        System.out.println("Insert phone number");
        user.phoneNumber = scanner.nextLine();

        System.out.println("Insert email");
        user.email = scanner.nextLine();

        return user;
    }


}
