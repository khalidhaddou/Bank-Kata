import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
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
        }
        for (int i = transactions.size() - 1; i >= 0; i--) {
            Transaction transaction = transactions.get(i);
            System.out.println(transaction.getDate() + " | " + transaction.getAmount() + " | " + balance);
            balance -= transaction.getAmount();
        }
    }
}