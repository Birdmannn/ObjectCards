import textio.TextIO;
public class BlackJackGame {
	
	public static void main(String[] args) {
		
		BlackjackHand blackjack = new BlackjackHand();
		Deck deck = new Deck();
		
		
		boolean playAgain;
		int noOfCards;
		
		do {
			deck.shuffle();
			noOfCards = (int)(5*Math.random())+2;
			for (int i = 1; i <= noOfCards; i++) {
				blackjack.addCard(deck.dealCard());
				
				System.out.println(deck.dealCard());
				
			}
			
			System.out.println("Do you wish to Play Again?");
			playAgain = TextIO.getlnBoolean();
		} while (playAgain);
	}

}
