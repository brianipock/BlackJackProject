package test;

import java.util.ArrayList;
import java.util.Collections;

public class DeckofCards  {
	ArrayList<Cards> deck = new ArrayList<>(52);
//	Collections shuffler;

	
public DeckofCards(){
	Cards c = new Cards();
	for (int i =0; i < CARDRANK.values().length; i++){
		for (int j =0; j < SUIT.values().length; j++){
		
			if( i < 8){
				c = new Cards(CARDRANK.values()[i], SUIT.values()[j], i+2);
			}
			if( i >= 8 && i <CARDRANK.values().length -1){
				c = new Cards(CARDRANK.values()[i], SUIT.values()[j], 10);
			}
			if( i == CARDRANK.values().length - 1){
				c = new Cards(CARDRANK.values()[i], SUIT.values()[j], 11);
			}
/*			I would like to add line here that says the deck is being shuffled, but it is being printed out 52 times.
 * 			It is somehow becoming part of the for loop.
 * 			I solved this by moving the Sysout outside of the for loop, as well as the suffleCards, since it is a method
 * 			i did however have to keep the deck.add(c) in the for loop to generate and add values to each new card
 */
			deck.add(c);
		}
//			Collections.shuffle(getDeck());
	}
			System.out.println("Now shuffling the Deck");
			shuffleCards();
			System.out.println(deck.size());
//			System.out.println(c);
//			System.out.println("Now dealing a card");
//			dealACard();
			
	/*	Here Aaron helped me to understand how to create a deck of cards,  I thought that this would be done in the Cards class(
	 * 	The reason it isn't contained in the cards class, is that card is just creating a blank card, that store the values for what
	 * 	a card should be.   So we are brining in the Cards() class, and making a new variable of it as c. Within that we are defining it
	 * with nested for loops to assign each blank card a CARDRANK and SUIT.  
	 * 
	 * 
	 */
			
}
public void shuffleCards() {
	Collections.shuffle(deck);
}


public ArrayList<Cards> getDeck() {
	return deck;
}

public void setDeck(ArrayList<Cards> deck) {
	this.deck = deck;
}

@Override
public String toString() {
	return "DeckofCards [deck=" + deck + "]";
}
	
	//shuffle cards
}
