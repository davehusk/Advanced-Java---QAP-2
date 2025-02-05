public class TestCreditCards {
    public static void main(String[] args) {
        // Set up constants for testing
        final Money LIMIT = new Money(1000); // Credit limit
        final Money FIRST_AMOUNT = new Money(200); // First charge
        final Money SECOND_AMOUNT = new Money(10.02); // Second charge
        final Money THIRD_AMOUNT = new Money(25); // Payment
        final Money FOURTH_AMOUNT = new Money(990); // Exceeding charge
        final Money FIFTH_AMOUNT = new Money(150); // Valid additional charge

        // Set up an owner with an address
        Address address = new Address("237J Harvey Hall", "Menomonie", "WI", "54751");
        Person owner = new Person("Diane", "Christie", address);

        // Create the credit card
        CreditCard visa = new CreditCard(owner, LIMIT);

        // Display initial credit card details
        System.out.println("** Initial Credit Card Details **");
        System.out.println("Owner: " + visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println();

        // Attempt a series of charges and payments
        System.out.println("** Transactions **");

        System.out.println("Attempt to charge " + FIRST_AMOUNT);
        visa.charge(FIRST_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Available Credit: " + visa.getAvailableCredit());
        System.out.println();

        System.out.println("Attempt to charge " + SECOND_AMOUNT);
        visa.charge(SECOND_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Available Credit: " + visa.getAvailableCredit());
        System.out.println();

        System.out.println("Attempt to pay " + THIRD_AMOUNT);
        visa.payment(THIRD_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Available Credit: " + visa.getAvailableCredit());
        System.out.println();

        System.out.println("Attempt to charge " + FOURTH_AMOUNT);
        visa.charge(FOURTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Available Credit: " + visa.getAvailableCredit());
        System.out.println();

        System.out.println("Attempt to charge " + FIFTH_AMOUNT);
        visa.charge(FIFTH_AMOUNT);
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Available Credit: " + visa.getAvailableCredit());
        System.out.println();

        // Final details
        System.out.println("** Final Credit Card Details **");
        System.out.println("Owner: " + visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());
        System.out.println("Available Credit: " + visa.getAvailableCredit());
    }
}
