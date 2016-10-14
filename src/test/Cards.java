package test;

import java.util.ArrayList;

public class Cards{
	private int value;
	private SUIT suits;
	private CARDRANK ranks;
/*  above we define the fields that will make each card
 *  we created enum's for both suits and ranks, because these would be used interchangibily for each 13 cards in a suit
 *  we brought over the enum (SUIT, CARDRANK) and assigned them feild variables suits, ranks so that they can be
 *  instantiated within our cards class.
 */
	
	public Cards(){	
	}
	public Cards( CARDRANK c, SUIT s, int v){
		ranks = c;
		suits = s;
		value = v;
	}

	@Override
	public String toString() {
		return "Cards value=\t" + value + ", \tsuits=" + suits + ", ranks=" + ranks + "";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public SUIT getSuits() {
		return suits;
	}

	public void setSuits(SUIT suits) {
		this.suits = suits;
	}

	public CARDRANK getRanks() {
		return ranks;
	}

	public void setRanks(CARDRANK ranks) {
		this.ranks = ranks;
	}

}
