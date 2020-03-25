package isp.lab5.exercise1;

public class ChangePin extends Transaction{
    public String oldPin;

    public String newPin;

    @Override
    public String execute() {
        return null;
    }

    public ChangePin(){
        this.oldPin=null;
        this.newPin=null;
    }
}
