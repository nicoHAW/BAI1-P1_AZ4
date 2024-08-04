package cardHand;

import java.util.Arrays;
import cards.Card;
import cards.Card.Suit;

/**
 * Hand
 * 
 * @author   Raffael Apitz & Frithjof Beims
 * @version  03.06.2024
 *
 */
public class Hand {

    private Card[] cards;

    private void assertErrIfInvalidCards(Card... cards) {
        assert cards != null : "The cards should not be null";
        for (int i = 0; i < cards.length; i++) {
            assert cards[i] != null : "No card should be null";
        }
    }

    //constructor > set this.cards to cards
    public Hand(Card... cards) {
        assertErrIfInvalidCards(cards);
        this.cards = cards;   
    }

    //add cards to this.cards
    public void add(Card... cards) {
        assertErrIfInvalidCards(cards);
        this.cards = combineCardArrays(this.cards, cards);   
    }

    //add cards from hand to cards
    public void add(Hand hand) {

        assert hand != null : "The hand should not be null";
        add(hand.getHandCards());
        //        assertErrIfInvalidCards(hand.getHandCards());
        //        cards = combineCardArrays(cards, hand.getHandCards());
    }

    //check if all cards have same suit
    public boolean isSuited() {
        boolean sameSuit = true;
        if (cards.length == 0) { //no cards > all have same suit
            return sameSuit;
        }
        final Card firstCard = cards[0]; //get the first element of array for comparison with others, this is safe because we check if the array has elements above, and we dont accept invalid cards in our add/constructor        
        final Suit firstCardSuit = firstCard.getSuit();

        int cardIndex = 1; //starting at 1, because we retrieved the card at index 0 above
        while (sameSuit && cardIndex < cards.length) {
            Card currentCard = cards[cardIndex++];
            Suit currentCardSuit = currentCard.getSuit();
            sameSuit = currentCardSuit == firstCardSuit;
        }
        return sameSuit;
    }

    //getter for cards
    public Card[] getHandCards() {
        return cards;
    }

    //setter for cards
    public void setHandCards(Card... cards) {
        assertErrIfInvalidCards(cards);
        this.cards = cards;   
    }

    //helper method to combine 2 Card-Arrays
    private Card[] combineCardArrays(Card[] cardArray1, Card[] cardArray2) {
        final Card[] combinedCards = new Card[cardArray1.length + cardArray2.length];
        // bestehende Karten zu Beginn der neuen Hand kopieren
        for (int i = 0; i < cardArray1.length; i++) {
            combinedCards[i] = cardArray1[i];
        }

        //neue Karten kommen nach den bestehenden Karten
        for (int i = 0; i < cardArray2.length; i++) {
            combinedCards[cardArray1.length + i] = cardArray2[i];
        }

        return combinedCards;
    }

}