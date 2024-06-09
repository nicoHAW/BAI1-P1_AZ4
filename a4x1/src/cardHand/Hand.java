package cardHand;

//imports
import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;

//Class Hand
public class Hand {

    //VARIABLES
    Card[] firstCardHand;

    
    
    //CONSTRUCTOR
    Hand(Card... givenCards) { 
        boolean validateCards = validateCards(givenCards); //validate if given Cards

        if (validateCards) { //creates Hand if Cards are validated.
            this.firstCardHand = givenCards;
        } //if
    } // constructor Hand

    

    //METHODS

    //method: asserts
    private boolean validateCards(Card... checkCards) {

        assert checkCards != null : "leeres Array"; //check for totoal array

        for (int assertIndex = 0; assertIndex<checkCards.length; assertIndex++) { //check for each row
            assert checkCards[assertIndex] != null : "leeres Array";
        } // for

        return true;
    } //method validateCards
    
    private boolean validateHand(Hand checkHand) {

        assert checkHand != null : "leeres Array";

        int assertIndex = 0;
        while (assertIndex<checkHand.firstCardHand.length) {
            assert checkHand.firstCardHand[assertIndex] != null : "leeres Array";
            assertIndex++;
            } //while
        return true;
        
    } //method validateCards

    

    //method: add more cards to firstHand
    public void add(Card... moreGivenCards) {
        boolean cardsToBeValidated = validateCards(moreGivenCards); //validate if given Cards
        
        if (cardsToBeValidated) {
            sortCards(moreGivenCards);
        }
        
    } // method add

    public void add(Hand givenHand) {
        boolean HandToBeValidated = validateHand(givenHand); //validate if given Cards

if (HandToBeValidated) {
        add(givenHand.firstCardHand);
        } //if
        
    }

private void sortCards(Card... cardsToSort) {
  
  //creates an total cards index
    int numberCardsTotal = cardsToSort.length + this.firstCardHand.length;
    
 //creates new array with lenght of new total cards.
    Card[] tempCardHand = new Card[numberCardsTotal];

    //place card from first Hand
    for (int i = 0; i < this.firstCardHand.length; i++) {
        tempCardHand[i]=this.firstCardHand[i];
    } //for

    //places new given Cards behind first Hand
    for (int i=0; i < cardsToSort.length; i++) {
        tempCardHand[this.firstCardHand.length+i] = cardsToSort[i];
    } //for
    
    this.firstCardHand = tempCardHand;
}

    //Method: compare color of Cards
    boolean isSuited( ) {            

        boolean sameSuite = true;

        if (this.firstCardHand.length != 0) {
            Card tempFirstCard = this.firstCardHand[0];
            Suit tempFirstCardSuit = tempFirstCard.getSuit();

            int i = 0;
            Card nextCard;
            while (sameSuite && i<this.firstCardHand.length) {
                nextCard = this.firstCardHand[i];
                Suit nextCardSuit = nextCard.getSuit();
                sameSuite = nextCardSuit.equals(tempFirstCardSuit);
                i++;
            }
        } // if
        
        return sameSuite;
    } //method isSuited

    //GETTER & SETTER

    //getter: return list of cards
    public Card[] getHandCards() {
        return firstCardHand;
    }

    //setter: set net Cards 
    public void setHandCards(Card...firstCardHand) {
        this.firstCardHand = firstCardHand;
    }



} //class
