package oop;

public class Address {

    public String street;
    public int number;
    private String city;
    public String country;
    public String postCode;

    public void show() {
        System.out.println(street + " " + number + ", " + city + ", " + country + ", postcode: " + postCode);
    }

    public String getCity() {
        return city;
    }
}
