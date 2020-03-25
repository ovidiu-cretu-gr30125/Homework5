package isp.lab5.exercise1;

public class WithdrawMoney extends Transaction{
    public double amount;

    @Override
    public String execute() {
        return null;
    }
    public WithdrawMoney(){this.amount=0;}

    public WithdrawMoney(double amount){this.amount=amount; }

    public double getAmount(){return amount;}


}
