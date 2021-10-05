package gdstruct.midterms;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        // Setup decks and hand
	    CardStack playerDeck = new CardStack(30);
        CardStack playerHand = new CardStack(30);
        CardStack discardPile = new CardStack(30);

        // Fill playerDeck
        loadDeck(playerDeck);

        // Turn Counter
        int turn = 1;

        // Game Intro
        System.out.println("Card Game");
        System.out.println("Total Cards: 30");
        System.out.println("Goal: Remove all cards from the Player Deck");
        System.out.println();
        System.out.println("Enter Any Key To Continue...");
        new java.util.Scanner(System.in).nextLine();

        // Game Proper
        while (playerDeck.countStack() > 0)
        {
            // Per turn text
            System.out.println("============================");
            System.out.println("Turn: " + turn);
            System.out.println("Available Commands:");
            System.out.println("[1] Draw from Player Deck");
            System.out.println("[2] Discard from Hand");
            System.out.println("[3] Draw from Discard Pile");
            System.out.println();
            System.out.println("Choosing a random command...");

            // Random Command Executor
            randomCommand(playerDeck, playerHand, discardPile);
            System.out.println();

            // Print Results
            roundResult(playerDeck, playerHand, discardPile);

            System.out.println("Enter Any Key To Continue...");
            new java.util.Scanner(System.in).nextLine();

            turn++;
        }

        // Game Ending
        System.out.println();
        System.out.println("================================================");
        System.out.println("There are no more cards in the player deck...");
        gameResult(playerDeck, playerHand, discardPile, turn);
    }

    // Load Deck
    public static void loadDeck(CardStack playerDeck)
    {
        //10 cards of Spades
        playerDeck.push(new Card(1, "Spade"));
        playerDeck.push(new Card(2, "Spade"));
        playerDeck.push(new Card(3, "Spade"));
        playerDeck.push(new Card(4, "Spade"));
        playerDeck.push(new Card(5, "Spade"));
        playerDeck.push(new Card(6, "Spade"));
        playerDeck.push(new Card(7, "Spade"));
        playerDeck.push(new Card(8, "Spade"));
        playerDeck.push(new Card(9, "Spade"));
        playerDeck.push(new Card(10, "Spade"));

        //10 Cards of Heart
        playerDeck.push(new Card(1, "Heart"));
        playerDeck.push(new Card(2, "Heart"));
        playerDeck.push(new Card(3, "Heart"));
        playerDeck.push(new Card(4, "Heart"));
        playerDeck.push(new Card(5, "Heart"));
        playerDeck.push(new Card(6, "Heart"));
        playerDeck.push(new Card(7, "Heart"));
        playerDeck.push(new Card(8, "Heart"));
        playerDeck.push(new Card(9, "Heart"));
        playerDeck.push(new Card(10, "Heart"));

        // 10 cards of Diamonds
        playerDeck.push(new Card(1, "Diamond"));
        playerDeck.push(new Card(2, "Diamond"));
        playerDeck.push(new Card(3, "Diamond"));
        playerDeck.push(new Card(4, "Diamond"));
        playerDeck.push(new Card(5, "Diamond"));
        playerDeck.push(new Card(6, "Diamond"));
        playerDeck.push(new Card(7, "Diamond"));
        playerDeck.push(new Card(8, "Diamond"));
        playerDeck.push(new Card(9, "Diamond"));
        playerDeck.push(new Card(10, "Diamond"));
    }

    // Random Command Executor
    public static void randomCommand(CardStack playerDeck, CardStack playerHand, CardStack discardPile)
    {
        int randomCommand = randomNum(3);

        if (randomCommand == 1)
        {
            System.out.println("Executing [1] Draw from Player Deck");
            draw(playerDeck, playerHand);
        }

        if (randomCommand == 2)
        {
            System.out.println("Executing [2] Discard from Hand");
            discard(playerHand, discardPile);
        }

        if (randomCommand == 3)
        {
            System.out.println("Executing [3] Draw from Discard Pile");
            drawFromDiscard(discardPile, playerHand);
        }
    }

    // [1] Draw Card
    public static void draw(CardStack playerDeck, CardStack playerHand)
    {
        // If there are no cards
        if (playerDeck.countStack() == 0)
        {
            System.out.println("There is nothing to draw from the player deck");
            return;
        }

        int cardsToDraw = randomNum(5);

        // If there are more cards to draw than the player deck
        if (cardsToDraw > playerDeck.countStack())
        {
            System.out.println("There are more cards to be drawn compared to the player deck");
            System.out.println("Cards to draw: " + playerDeck.countStack());
            for (int j = 0; j < playerDeck.countStack(); j++)
            {
                System.out.println("Drawing: " + playerDeck.peek());
                playerHand.push(playerDeck.pop());
            }
            return;
        }

        System.out.println("Cards to draw: " + cardsToDraw);
        for (int i = 0; i < cardsToDraw; i++)
        {
            System.out.println("Drawing: " + playerDeck.peek());
            playerHand.push(playerDeck.pop());
        }
    }

    // [2] Discard
    public static void discard(CardStack playerHand, CardStack discardPile)
    {
        // If there are no cards
        if (playerHand.countStack() == 0)
        {
            System.out.println("There is nothing to discard from the player hand");
            return;
        }

        int cardsToBeDiscarded = randomNum(5);

        // If there are more cards to discard than the hand
        if (cardsToBeDiscarded > playerHand.countStack())
        {
            System.out.println("There are more cards to be discarded compared to the hand");
            System.out.println("Cards to discard: " + playerHand.countStack());
            for (int j = 0; j < playerHand.countStack(); j++)
            {
                System.out.println("Discarding: " + playerHand.peek());
                discardPile.push(playerHand.pop());
            }
            return;
        }

        System.out.println("Cards to discard: " + cardsToBeDiscarded);
        for (int i = 0; i < cardsToBeDiscarded; i++)
        {
            System.out.println("Discarding: " + playerHand.peek());
            discardPile.push(playerHand.pop());
        }
    }

    // [3] Draw from Discard Pile
    public static void drawFromDiscard(CardStack discardPile, CardStack playerHand)
    {
        // If there are no cards
        if (discardPile.countStack() == 0)
        {
            System.out.println("There is nothing to draw from the discard pile");
            return;
        }

        int cardsToDrawFromDiscard = randomNum(5);

        // If there are more cards to draw than the discard Pile
        if (cardsToDrawFromDiscard > discardPile.countStack())
        {
            System.out.println("There are more cards to be drawn compared to the discard pile");
            System.out.println("Cards to draw: " + discardPile.countStack());
            for (int j = 0; j < discardPile.countStack(); j++)
            {
                System.out.println("Drawing: " + discardPile.peek());
                playerHand.push(discardPile.pop());
            }
            return;
        }

        System.out.println("Cards to draw: " + cardsToDrawFromDiscard);
        for (int i = 0; i < cardsToDrawFromDiscard; i++)
        {
            System.out.println("Drawing from discard: " + discardPile.peek());
            playerHand.push(discardPile.pop());
        }
    }

    // Random Number Generator
    public static int randomNum(int limit)
    {
        Random rand = new Random();
        int randNum = rand.nextInt(limit) + 1;
        return randNum;
    }

    // Print round results
    public static void roundResult(CardStack playerDeck, CardStack playerHand, CardStack discardPile)
    {
        System.out.println("Player Hand Card List:");
        playerHand.printStack();
        System.out.println("Player Deck Cards: " + playerDeck.countStack());
        System.out.println("Discard Pile Cards: " + discardPile.countStack());
    }

    // Print game results
    public static void gameResult(CardStack playerDeck, CardStack playerHand, CardStack discardPile, int turns)
    {
        System.out.println("==========< Game Summary >==========");
        System.out.println();
        System.out.println("Turns taken:" + turns);
        System.out.println("Player Deck Cards: " + playerDeck.countStack());
        System.out.println("Player Hand Cards: " + playerHand.countStack());
        System.out.println("Discard Pile Cards: " + discardPile.countStack());
    }
}
