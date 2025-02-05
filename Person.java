public class Person {
    private String firstName; // First name
    private String lastName;  // Last name
    private Address home;     // Home address

    // Constructor: Initialize person fields
    public Person(String firstName, String lastName, Address home) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }

    // Turn person details into a formatted string
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + home;
    }
}
