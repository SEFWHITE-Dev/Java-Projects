
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here

//        ArrayList<Card> cards = new ArrayList<>();
//
//        cards.add(new Card(3, Suit.SPADE));
//        cards.add(new Card(2, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.SPADE));
//        cards.add(new Card(12, Suit.HEART));
//        cards.add(new Card(2, Suit.SPADE));
//
//        SortBySuit sortBySuitSorter = new SortBySuit();
//        Collections.sort(cards, sortBySuitSorter);
//
//        cards.stream().forEach(c -> System.out.println(c));
        
        //Collections.sort(cards, new SortBySuit());
        //Collections.sort(cards, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
        
        Hand hand = new Hand();

hand.add(new Card(12, Suit.HEART));
hand.add(new Card(4, Suit.SPADE));
hand.add(new Card(2, Suit.DIAMOND));
hand.add(new Card(14, Suit.SPADE));
hand.add(new Card(7, Suit.HEART));
hand.add(new Card(2, Suit.SPADE));

hand.sortBySuit();

hand.print();
    }
}
