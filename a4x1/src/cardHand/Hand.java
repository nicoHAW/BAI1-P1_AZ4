package cardHand;

//imports
import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;

//Class Hand
public class Hand {
    //variables
    Card[] firstCardHand; //attribute cardHand
    //Card[] secondCardHand; //attribute cardHand

    //TODO:Fehler beheben. Aber wie?

    //CONSTRUCTOR
    //constructor with varargs to be more flexible with given cards. 
    Hand(Card... givenCards) { 
        assert givenCards != null : "leeres Array";
        this.firstCardHand = givenCards;


    } // constructor Hand


    //METHODS

    //Method to add more Cards
    public void add(Card... moreGivenCards) {

        //creates an total cards index
        int numberCardsTotal = moreGivenCards.length + this.firstCardHand.length;

        //creates new array with lenght of new total cards.
        Card[] tempCardsHand = new Card[numberCardsTotal];

        //place card from first Hand
        int i = 0;
        while (i < firstCardHand.length) {
            tempCardsHand[i]=this.firstCardHand[i];
            i++;
        } //while 

        //places new given Cards behind first Hand
        i = 0;
        while (i < moreGivenCards.length) {
            tempCardsHand[this.firstCardHand.length+i] = moreGivenCards[i];
            i++;
        } //while

        this.firstCardHand = tempCardsHand;
    } // method add

    public void add(Hand givenHand) {

        //creates an total cards index
        int numberCardsTotal = givenHand.firstCardHand.length + this.firstCardHand.length;

        //creates new array with lenght of new total cards.
        Card[] secondCardHand = new Card[numberCardsTotal];

        //place card from first Hand
        int i = 0;
        while (i < this.firstCardHand.length) {
            secondCardHand[i]=this.firstCardHand[i];
            i++;
        } //while 

        //places new given Cards behind first Hand
        i = 0;
        while (i < givenHand.firstCardHand.length) {
            secondCardHand[this.firstCardHand.length+i] = givenHand.firstCardHand[i];
            i++;
        } //while
    }



    //Method: compare color of Cards
    boolean isSuited( ) {            
        assert this.firstCardHand != null : "leeres Array";
        
        int assertIndex = 0;
        while (assertIndex<this.firstCardHand.length) {
            assert this.firstCardHand[assertIndex] != null : "leeres Array";
            assertIndex++; } 

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
        } // while  
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
