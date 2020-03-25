package isp.lab5.exercise1;

public class Card {
    private String cardId;

    private String pin;

    public Card(){}

    public Card(String cardId,String pin){
        this.cardId=cardId;
        this.pin=pin;
    }

    public String getCardId(){
        return cardId;
    }

    public String getPin(){
        return pin;
    }
}

