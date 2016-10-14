package test;

import java.util.ArrayList;
import java.util.Collections;

public class DeckofCards {
	ArrayList<Cards> deck = new ArrayList<>(52);

	
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
//			System.out.println("Now shuffling the Deck");
			Collections.shuffle(getDeck());
			deck.add(c);
	/*	Here Aaron helped me to understand how to create a deck of cards,  I thought that this would be done in the Cards class(
	 * 	The reason it isn't contained in the cards class, is that card is just creating a blank class, 
	 * 
	 * 
	 * 
	 * 
	 */
			
		}
	}
}
//public  shuffleCard() {

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
