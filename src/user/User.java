package user;

public class User {

    private String firstName;
    private String lastName;
    private int pesel;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPesel() {
        return pesel;
    }

    public User(String firstName, String lastName, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "firstName = " + UserStorage.capitalize(firstName) +
                ", lastName = " + UserStorage.capitalize(lastName) +
                ", pesel = " + pesel;
    }
}
