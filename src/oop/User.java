package oop;

public class User {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public Address address;

    public User () {

    }

    public User(String firstName, String lastName, String phoneNumber, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public void introduceYourself() {
        System.out.println(firstName + " " + lastName + ", phone number: " + phoneNumber + ", email: " + email);
        if (address != null) {
            address.show();
        }
    }



}
