public class CreditCard {
    private Money balance;     // The current balance on the card
    private Money creditLimit; // The maximum credit allowed
    private Person owner;      // The owner of the card

    // Constructor: Set up the credit card
    public CreditCard(Person newCardHolder, Money limit) {
        this.owner = newCardHolder;            // Set the owner
        this.creditLimit = new Money(limit);  // Copy the credit limit using the copy constructor
        this.balance = new Money(0.0);        // Start with a zero balance
    }

    // Get the balance securely (return a new Money object)
    public Money getBalance() {
        return new Money(balance); // Return a copy of the balance
    }

    // Get the available credit securely (creditLimit - balance)
    public Money getAvailableCredit() {
        return creditLimit.subtract(balance); // Return available credit as a new Money object
    }

    // Get the credit limit securely (return a new Money object)
    public Money getCreditLimit() {
        return new Money(creditLimit); // Return a copy of the credit limit
    }

    // Get the owner's information as a formatted string
    public String getPersonals() {
        return owner.toString(); // Use the Person's toString method
    }

    // Charge an amount to the credit card
    public void charge(Money amount) {
        // Check if the new balance would exceed the credit limit
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount); // Add the charge to the balance
            System.out.println("Charge: " + amount); // Print the charge amount
        } else {
            System.out.println("Exceeds credit limit"); // Print an error message
            System.out.println("  by " + balance.add(amount).subtract(creditLimit)); // Print the amount over the limit
        }
    }

    // Make a payment on the credit card
    public void payment(Money amount) {
        balance = balance.subtract(amount); // Subtract the payment from the balance
        System.out.println("Payment: " + amount); // Print the payment amount
    }
}
