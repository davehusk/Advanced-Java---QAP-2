public class Money {
    private long dollars; // Whole dollar amount
    private long cents;   // Cents (0-99)

    // Constructor: Create Money from a double
    public Money(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount cannot be negative");
        this.dollars = (long) amount; // Get dollars
        this.cents = Math.round((amount - this.dollars) * 100); // Get cents
    }

    // Copy Constructor: Duplicate Money object
    public Money(Money other) {
        this.dollars = other.dollars; // Copy dollars
        this.cents = other.cents;     // Copy cents
    }

    // Add two Money objects
    public Money add(Money other) {
        long totalCents = this.toCents() + other.toCents();
        return fromCents(totalCents);
    }

    // Subtract one Money object from another
    public Money subtract(Money other) {
        long totalCents = this.toCents() - other.toCents();
        if (totalCents < 0) throw new IllegalArgumentException("Cannot subtract into negative");
        return fromCents(totalCents);
    }

    private long toCents() {
        return dollars * 100 + cents; // Convert to cents
    }

    private static Money fromCents(long totalCents) {
        long dollars = totalCents / 100;
        long cents = totalCents % 100;
        return new Money(dollars + (cents / 100.0));
    }

    // Check if this Money object is equal to another
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same object
        if (obj == null || getClass() != obj.getClass()) return false; // Not same type
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents; // Compare dollars and cents
    }

    // Compare this Money object to another
    public int compareTo(Money other) {
        return Long.compare(this.toCents(), other.toCents());
    }

    // Turn the Money object into a string
    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents); // Format as dollars.cents
    }

}
