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
    Card[] secondCardHand; //attribute cardHand


    //constructor
    Hand(Card... givenCards) { //varargs to be flexible with arrays
        assert givenCards.length > 0 || givenCards != null : "Die Hand ist leer. Bitte keine leere Hand übergeben.";
        this.firstCardHand = givenCards.clone();
    }

    //Method to add more Cards
    public void add(Card... moreGivenCards) {
        int numberCardstotal = moreGivenCards.length + this.firstCardHand.length;
        
        Card moreGivenCards.secondCardHand = new secondCardHand[numberCardstotal];
        
        

    } // add
/*
    // Overload von Karte
    public Hand add(Card... newHand) {
        Hand();

   } //add
*/
    
} //class
