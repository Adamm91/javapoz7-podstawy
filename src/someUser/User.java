package someUser;

public class User {

    private String firstName;
    private String LastName;
    private int age;
    private int ID;

    public User(String firstName, String lastName, int age, int ID) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
