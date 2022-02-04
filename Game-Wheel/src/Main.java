import java.util.*;

public class Main {

    public static void main (String[] args) {

        GameWheel wheel = new GameWheel();
        ArrayList<PrizeCard> playerOne = new ArrayList<>();
        ArrayList<PrizeCard> playerTwo = new ArrayList<>();

        int playerOneSum = 0;
        int playerTwoSum = 0;

        while (playerOne.size() < 5) {
            PrizeCard card = wheel.spinWheel();
            if (!playerOne.contains(card)) {
                playerOne.add(card);
                playerOneSum += card.getPrizeAmount();
            }
        }

        while (playerTwo.size() < 5) {
            PrizeCard card = wheel.spinWheel();
            if (!playerTwo.contains(card)) {
                playerTwo.add(card);
                playerTwoSum += card.getPrizeAmount();
            }
        }

        System.out.println("Player 1 Total: $" + playerOneSum);
        for (PrizeCard card : playerOne) {
            System.out.println(card);
        }
        System.out.println("\nPlayer 2 Total: $" + playerTwoSum);
        for (PrizeCard card : playerTwo) {
            System.out.println(card);
        }
        System.out.println("\n" + Main.winner(playerOneSum, playerTwoSum));

    }

    public static String winner(int one, int two) {
        if (one > two) {
            return "Player 1 won by $" + (one - two) + "!";
        } else if (two > one) {
            return "Player 2 won by $" + (two - one) + "!";
        } else {
            return "It's a tie!";
        }
    }
}
