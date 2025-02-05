// Defines an address using a street, city, state, and zipcode

public class Address {
    private String street; // Street address
    private String city;   // City
    private String state;  // State abbreviation
    private String zip;    // ZIP code

    // Constructor: Initialize address fields
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Turn address into a formatted string
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
