package test;

public class Test {
	public static void main(String[] args) {
		DeckofCards deck = new DeckofCards();
		for (Cards d : deck.getDeck()) {
			System.out.println(d);
		}
	}

}
