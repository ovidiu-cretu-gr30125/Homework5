package isp.lab5.exercise1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Card card = new Card("4090 2347 4328 3829","1234");

        Account account = new Account(card,"Ovidiu Cretu",751.5);

        Bank bank = new Bank();

        bank.addAccount(account);

        ATM atm = new ATM(bank,card);

        Transaction transaction = new Transaction() {
            @Override
            public String execute() {
                return null;
            }
        };

        atm.insertCard(card,"1234");

        bank.executeTransaction(transaction);
        double amount=0;
        System.out.println("Introduce the amount:");
        Scanner amountin = new Scanner(System.in);
        amount=amountin.nextDouble();
        if(atm.checkMoneyForWithDraw(account)>=amount) {
            atm.withdraw(amount);
        }
        else{
            System.out.println("Not enough money!");
        }

        atm.changePin("1234","0000");
    }
}
