import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    final List<Transaction> transactions = new ArrayList<>();

    @Override
    public void deposit(int amount) {
        transactions.add(new Transaction(amount));
    }

    @Override
    public void withdraw(int amount) {
        transactions.add(new Transaction(-amount));
    }

    @Override
    public void printStatement() {
        System.out.println("DATE | AMOUNT | BALANCE");
        int balance = 0;
        for (Transaction transaction : transactions) {
            balance += transaction.getAmount();
            System.out.println(transaction.getDate() + " | " + transaction.getAmount() + " | " + balance);
        }
    }
}
