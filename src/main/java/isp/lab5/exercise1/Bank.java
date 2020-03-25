package isp.lab5.exercise1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public void addAccount(Account account){
        accounts.add(account);
    }

    public String executeTransaction(Transaction transaction){
        return null;
    }

    public Account getAccountByCardId(String cardId){
        for(int i=0;i<10;i++){
            if(cardId==accounts.get(i).getCard().getCardId())
                return accounts.get(i);
        }
        return null;
    }
}
