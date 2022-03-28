import textio.TextIO;
public class BlackJackGame3 {
	
	public static void main(String[] args) {
		
		Deck deck;
		BlackjackHand blackjack;
		Card card;
		int noOfCards;
		boolean playAgain;
		
		deck = new Deck();
		
		do {
			deck.shuffle();
			blackjack = new BlackjackHand();
			noOfCards = (int)(5*Math.random()) + 2;
			System.out.println();
			System.out.println();
			System.out.println("Hand contains: ");
			
			for (int i = 1; i <= noOfCards; i++) {
				//Get a card from the deck, print it out, an add it to the hand.
				blackjack.addCard(deck.dealCard());
				System.out.println("    " + deck.dealCard());
			}
			System.out.println("Value of hand is " + blackjack.getBlackjackValue());
			System.out.println();
			System.out.println("Do you wish to perform this program again? ");
			playAgain = TextIO.getlnBoolean();
			
		} while (playAgain);
	}

}
