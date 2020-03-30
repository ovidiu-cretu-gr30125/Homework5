package isp.lab5.exercise1;

public class WithdrawMoney extends Transaction{
    public double amount;

    public WithdrawMoney(){
        this.amount=0;
    }

    public WithdrawMoney(double amount) {
        this.amount=amount;
    }

    public double getAmount(){
        return amount;
    }

    @Override
    public String execute() {
        if(amount<=account.getBalance()){
            account.setBalance((account.getBalance())-amount);
            return "Transaction done! New Balance"+account.getBalance()+"";
        }
        else
            return "Not enough money!";
    }
}
