package test;

import java.util.Scanner;

public class CardShoe {
	int number;
	Scanner kb = new Scanner(System.in);
	
	
	public CardShoe(){
		DeckofCards numOfDecks = new DeckofCards();
		System.out.println("How many decks would you like to play with?");
		System.out.println("Choose between 1-6 decks.");
		number =  kb.nextInt();
		
		
//		for(int i = 0; i < number; i++){
			
		
		
		
		
//		switch  (number){
//		
//		case 1: System.out.println(numOfDecks);
//		
//		case 2: System.out.println();
//		
//		case 3:
//			
//		case 4:
//			
//		case 5:
//			
//		case 6:
		}
//		else if (number == 2){
//			for(int i =0; i < )
//			System.out.println(numOfDecks.getDeck());
//		}
//		
	}


	@Override
	public String toString() {
		return "CardShoe [number of decks" + kb;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public Scanner getKb() {
		return kb;
	}


	public void setKb(Scanner kb) {
		this.kb = kb;
	}
}
