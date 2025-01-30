import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testDepositAndWithdraw() {
        AccountService account = new Account();
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        assertEquals(3, ((Account) account).transactions.size());  // Devrait contenir 3 transactions
    }

}

