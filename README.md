# BlackJackProject
I have 4 classes and 2 enums A test class, a Cards class, a DeckofCards class, and a Hand class.  Two Enums for SUITS and CARDRANK.

The Card class develops the basic shell for what a card will be, it instantiates a Suit, Rank, and value.  This is the framework for our 52 cards in a deck, and the Array is hard coded at 52 as well.

The Deck of Cards class, takes in a Card object and populates each of the 52 cards with a Suit, Rank, and Value.  The Deck of Cards also takes in a shuffle deck method, so each deck is randomized.

There is also a trash deck here that helps to cycle through the 52 cards once they are exhausted, this function comes from the methods in the test class.

The test method has the actual game and logic contained within, there is a method create deck which is the overall method to play the game.  It creates a new deck based on the conditions of the other methods.

