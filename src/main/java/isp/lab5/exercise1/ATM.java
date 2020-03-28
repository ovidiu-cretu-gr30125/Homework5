package isp.lab5.exercise1;

public class ATM {
    private Bank bank = new Bank();

    private Card card = new Card();

    public ATM(Bank bank,Card card){
        this.bank=bank;
        this.card=card;
    }

    public void changePin(String oldPin,String newPin){
        ChangePin cp = new ChangePin();
        cp.oldPin=oldPin;
        cp.newPin=newPin;
    }

    public void withdraw(double amount ){
        WithdrawMoney wm = new WithdrawMoney();
        wm.amount=amount;
        System.out.println("Take the money!");
    }

    public void checkMoney(Account account){
        CheckMoney cm = new CheckMoney();
        cm.account=account;
        System.out.println(cm.account.getBalance());
    }

    public double checkMoneyForWithDraw(Account account){
        CheckMoney cm = new CheckMoney();
        cm.account=account;
        return cm.account.getBalance();
    }


    public boolean insertCard(Card card, String pin){
        if(card.getPin()==pin){
            this.card=card;
            return true;
        }
        return false;
    }

    public  void removeCard(){
        this.card=null;
    }
}
