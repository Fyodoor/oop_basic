package four.interfaces;

public interface Player {
    void takeCard(Card card);
    int countValuesOfAllCardsOnHand();
    boolean needCard();
    void showCardsOnHand();
}
