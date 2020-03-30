package isp.lab5.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<Account>();

    private ArrayList<Card> cards = new ArrayList<Card>();

    public void addCard(Card card){
        cards.add(card);
    }
    public  Bank(Account[] account){
        Collections.addAll(accounts,account);
    }

    public String executeTransaction(Transaction transaction){
        return "Transaction done! Thank you!";
    }

    public Account getAccountByCardId(String cardId){
        for(int i=0;i<10;i++) {
            System.out.println(accounts.get(i));
            if (accounts.get(i).getCard().getCardId().equals(cardId)) {
                return accounts.get(i);
            }
        }
        return null;
    }
}
