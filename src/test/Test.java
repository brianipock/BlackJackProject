package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	createDeck();
	}
	public static void createDeck(){
		DeckofCards deck = new DeckofCards();
		dealAHand(deck);
	}
	
	public static void dealAHand(DeckofCards deck){
		Cards firstCard = deal(deck);
		Cards secondCard = deal(deck);
		Cards thirdCard = deal(deck);
		Cards fourthCard = deal(deck);
//		for (Cards d : deck.getDeck()) {
//			System.out.println(d);
//		}
		
		Hand playingHand = new Hand();
			System.out.println("Your card: " + firstCard);
			playingHand.addCardToHand(firstCard);
			System.out.println("Your card: " + thirdCard);
			playingHand.addCardToHand(thirdCard);
			System.out.println("Your hand Value: " + handTotal(playingHand));
	
			
			
		Hand dealerHand = new Hand();
			dealerHand.addCardToHand(secondCard);
			System.out.println("Dealer card: " + secondCard);
			dealerHand.addCardToHand(fourthCard);
			System.out.println("Dealer card: " + fourthCard);
			System.out.println("Dealer hand Value: " + handTotal(dealerHand));
			
			hitOrStand(playingHand, dealerHand, deck);
	}
	public static void hitOrStand(Hand player, Hand dealer, DeckofCards deck){
		Scanner kb = new Scanner(System.in);
		if(handTotal(player)==21||handTotal(dealer)==21){
			if(handTotal(player)==21){
					System.out.println("BlackJack!!  You win!!");
			}
			if(handTotal(dealer)==21){
				System.out.println("BlackJack!!  Dealer Wins!!");
			}
			playAgain(deck, kb);
			System.exit(0);
		}
		if(handTotal(player)>21){
			System.out.println("Bust, hand over yo money");
			playAgain(deck, kb);
		}
		else{
			System.out.println("Do you want to hit or stand");
			String hitchoice = kb.next().toLowerCase();
			if(hitchoice.equals("hit")){
				player.addCardToHand(deal(deck));
				System.out.println("Your hand Value: " + handTotal(player));
				hitOrStand(player, dealer, deck);
			}
			else if(hitchoice.equals("stand")){
				while(handTotal(dealer)< 17){
					dealer.addCardToHand(deal(deck));
					System.out.println("Dealer hand Value: " + handTotal(dealer));
				}
				if(handTotal(dealer)>21){
					System.out.println("Dealer Busts, take your money");
					playAgain(deck, kb);
				}
				else{
					if(handTotal(dealer)>handTotal(player)){
						System.out.println("Dealer Wins, you lost your money");
						playAgain(deck, kb);
					}if(handTotal(dealer)<handTotal(player)){
						System.out.println("You Win, take your money");
						playAgain(deck, kb);
					}if(handTotal(dealer)==handTotal(player)){
						System.out.println("Push goes to the Dealer, you lost your money");
						playAgain(deck, kb);
					}	
				}
					
			}
			else{
				System.err.println("you have entered an invalid choice");
				hitOrStand(player, dealer, deck);
				
			}
		}
		
	}
	
	public static void checkDeckCount(DeckofCards deck){
		ArrayList<Cards> newList = new ArrayList<Cards>();
		if(deck.getDeck().size()<8){
			for (Cards c : deck.getTrashDeck()) {
				newList.add(c);
			}
			for (Cards c : deck.getDeck()) {
				newList.add(c);
			}
			
			Collections.shuffle(newList);
			deck.setDeck(newList);
		}
	}
	public static void playAgain(DeckofCards deck, Scanner scanner){
		System.out.println("Do you want to play again");
		char yesNo = scanner.next().toLowerCase().charAt(0);
		
		if(yesNo=='y'){
			System.out.println("You gotta know when to Hold'em, and Know when to Fold'em");
			checkDeckCount(deck);
			dealAHand(deck);
		}
		else if(yesNo=='n'){
			System.out.println("You gotta know when to walk away, and know when to RUN");
		}
		else{
			System.out.println("You have entered an invalid statment. ");
			playAgain(deck, scanner);
		}
	}
	
	public static int handTotal(Hand cardsInHand){
		int handTotal = 0;
		for (Cards calculateTotal : cardsInHand.getHand()) {
			handTotal= handTotal + calculateTotal.getValue();
			
		}
		
		return handTotal;
	}
	
	
	public static Cards deal(DeckofCards dec){
		
		Cards deltCard = dec.getDeck().get(0);
		dec.getDeck().remove(deltCard);
//		System.out.println("Your card is " + deltCard);
		dec.addToTrashDeck(deltCard);
		System.out.println(dec.getDeck().size());
		return deltCard;
	}

}
