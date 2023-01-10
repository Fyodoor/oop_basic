package four.interfaces;

public interface GameBj {
    void addPlayerInGame(Player player); // добавить игрока в игру

    void giveTwoCardsOnHand(); // раздача 2 карт на старте

    void giveOneCardIfNeedToPlayer(); // давать одну карту игроку, если ему нужно

    void printWinner(); // объявить победителя
}
