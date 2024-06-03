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
        assert givenCards.length > 0 || givenCards != null : "Die Hand ist leer. Bitte keine leere Hand übergeben.";
        this.firstCardHand = givenCards.clone();
    } // constructor Hand


    //METHODS

    //Method to add more Cards
    public void add(Card... moreGivenCards) {

        //creates an total cards index
        int numberCardsTotal = moreGivenCards.length + this.firstCardHand.length;

        //creates new array with lenght of new total cards.
        Card[] secondCardHand = new Card[numberCardsTotal];

        //place card from first Hand
        int i = 0;
        while (i < firstCardHand.length) {
            secondCardHand[i]=this.firstCardHand[i];
            i++;
        } //while 

        //places new given Cards behind first Hand
        i = 0;
        while (i < numberCardsTotal-1) {
            secondCardHand[this.firstCardHand.length+i] = moreGivenCards[i];
            i++;
        } //while

        this.firstCardHand = secondCardHand;
    } // method add

    //Method: compare color of Cards
    boolean isSuited(Card... checkCards) {            
        assert checkCards.length > 0 || checkCards != null : "Keine Karten zum Prüfen vorhanden. ";    

        Card firstCard = checkCards[0];
        Suit firstCardSuit = firstCard.getSuit();

        int i = 0;
        Card nextCard;
        boolean sameSuite = true;
        while (sameSuite && i<checkCards.length) {
            nextCard = checkCards[i];
            Suit nextCardSuit = nextCard.getSuit();
            sameSuite = nextCardSuit.equals(firstCardSuit);
            i++;
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
