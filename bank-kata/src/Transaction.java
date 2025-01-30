import java.time.LocalDate;

public class Transaction {
    private final LocalDate date;
    private final int amount;

    public Transaction(int amount) {
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}