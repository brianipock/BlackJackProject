package test;

import java.util.ArrayList;

public class Hand {
	
	ArrayList<Cards> hand = new ArrayList<>();

	
	public void addCardToHand(Cards yourCard){
		hand.add(yourCard);
		
	}
	
	
	
	
	
	
	public ArrayList<Cards> getHand() {
		return hand;
	}

	public void setHand(ArrayList<Cards> hand) {
		this.hand = hand;
	}
		
	}