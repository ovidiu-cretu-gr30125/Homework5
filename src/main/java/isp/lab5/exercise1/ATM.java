package isp.lab5.exercise1;

public class ATM {
    private Bank bank;
    private Card card;

    public ATM(Bank bank,Card card){
        this.bank=bank;
        this.card=card;
        bank.addCard(card);
    }

    public void changePin(String oldPin,String newPin){
        if(this.card!=null) {
            Transaction transaction;
            transaction = new ChangePin(oldPin, newPin);
            transaction.account=bank.getAccountByCardId(this.card.getCardId());
            System.out.println(transaction.execute());
            System.out.println(bank.executeTransaction(transaction));
        }
        else
            System.out.println("Card is null!");
    }

    public void withdraw(double amount ){
       if(this.card!=null){
           Transaction transaction = new WithdrawMoney(amount);
           transaction.account=bank.getAccountByCardId(this.card.getCardId());
           System.out.println(transaction.execute());
           System.out.println(bank.executeTransaction(transaction));
       }
       else
           System.out.println("Card is null!");
    }

    public void checkMoney(){
       if(this.card!=null){
           Transaction transaction;
           transaction = new CheckMoney(bank.getAccountByCardId(this.card.getCardId()));
           System.out.println(transaction.execute());
           System.out.println(bank.executeTransaction(transaction));
       }
       else
           System.out.println("Card is null!");
    }


    public boolean insertCard(Card card, String pin){
        if(card.getPin().equals(pin)){
            this.card=card;
            System.out.println("Card inserted successfully!");
            return true;
        }
        return false;
    }

    public  void removeCard(){
        this.card=null;
    }
}
