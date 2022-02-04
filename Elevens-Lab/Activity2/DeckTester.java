public class DeckTester {

    public static void main(String[] args) {

        String[] ranks1 = {"Jack", "Queen", "King"};
        String[] suits1 = {"Hearts", "Spades", "Diamonds"};
        int[] values1 = {11, 12, 13};
        String[] ranks2 = {"3", "4", "5"};
        String[] suits2 = {"Clubs", "Spades", "Diamonds"};
        int[] values2 = {3, 4, 5};
        String[] ranks3 = {"Ace", "7", "King"};
        String[] suits3 = {"Diamonds", "Spades", "Hearts"};
        int[] values3 = {1, 7, 13};

        // DECK 1
        Deck deck1 = new Deck(ranks1, suits1, values1);
        System.out.println("Deck 1 Size: " + deck1.size());

        // DECK 2
        Deck deck2 = new Deck(ranks2, suits2, values2);
        System.out.println("Is Deck 2 Empty: " + deck2.isEmpty());

        // DECK 3
        Deck deck3 = new Deck(ranks3, suits3, values3);
        System.out.println("Dealt card from Deck 3: " + deck3.deal());

    }
}
