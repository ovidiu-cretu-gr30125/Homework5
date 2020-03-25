package isp.lab5.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BankTest {
    Card card = new Card("4090 2347 4328 3829","1234");

    Account account = new Account(card,"Ovidiu Cretu",751.5);

    Bank bank = new Bank();

    ATM atm = new ATM(bank,card);

    Transaction transaction = new Transaction() {
        @Override
        public String execute() {
            return null;
        }
    };
    @Test
    public void getAccountByCardIdTest(){
        bank.addAccount(account);
        assertEquals(account,bank.getAccountByCardId("4090 2347 4328 3829"));
    }
}
