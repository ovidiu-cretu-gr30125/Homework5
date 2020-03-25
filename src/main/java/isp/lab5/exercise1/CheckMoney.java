package isp.lab5.exercise1;

public class CheckMoney extends  Transaction {

    public Account account;

    public CheckMoney(){
        this.account=null;
    }
    public CheckMoney(Account account){
        this.account=account;
    }
    public double getAccountBalance(Account account){
        return account.getBalance();
    }
    @Override
    public String execute() {
        return null;
    }
}
