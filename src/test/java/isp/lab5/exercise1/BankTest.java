package isp.lab5.exercise1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BankTest {
    @Test
    public void getAccountByCardIdTest(){
        Card[] card = new Card[10];
        for(int i=0;i<10;i++){
            card[i]= new Card("000"+i,"50"+i);
        }
        Account[] account = new Account[10];
        for(int i=0;i<10;i++){
            account[i] = new Account(card[i],"Owner"+i,10*i);
        }
        Bank bank = new Bank(account);

        ATM atm = new ATM(bank,card[0]);

        assertEquals(atm.insertCard(card[0],"500"),true);

    }
}
