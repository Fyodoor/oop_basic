package four.models;

import four.interfaces.Card;

public class CardImpl implements Card{
    private String nameCard;
    private int value;


    public CardImpl(String nameCard, int value) {
        this.nameCard = nameCard;
        this.value = value;
    }

    @Override
    public void printCard() {
        System.out.println(nameCard);
    }

    @Override
    public int getValue() {
        return value;
    }
}
