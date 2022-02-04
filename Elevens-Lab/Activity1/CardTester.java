public class CardTester {

    public static void main(String[] args) {
        Card cardA = new Card("Jack", "Diamonds", 11);
        Card cardB = new Card("Queen", "Hearts", 12);
        Card cardC = new Card("King", "Clubs", 13);

        // CARD A
        System.out.println(cardA.rank());
        System.out.println(cardA.suit());
        System.out.println(cardA.pointValue());
        System.out.println(cardA.matches(cardB));
        System.out.println(cardA.toString() + "\n");
        // CARD B
        System.out.println(cardB.rank());
        System.out.println(cardB.suit());
        System.out.println(cardB.pointValue());
        System.out.println(cardB.matches(cardB));
        System.out.println(cardB.toString() + "\n");
        // CARD C
        System.out.println(cardC.rank());
        System.out.println(cardC.suit());
        System.out.println(cardC.pointValue());
        System.out.println(cardC.matches(cardA));
        System.out.println(cardC.toString());
    }
}
