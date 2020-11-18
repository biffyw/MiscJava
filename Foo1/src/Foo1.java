import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * 
 */

/**
 * @author Bev
 *
 */
public class Foo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Card> cards = new ArrayList<Card>();
		
		players.add( new Player("Alice"));
		players.add( new Player("Bob"));
		players.add( new Player("Cyril"));
		
		// initialise the deck with 52 cards
		for( int i = 0; i < 4; i++ ) {
			for( int j = 0; j < 13; j++ ) {
				cards.add(new Card(j, i));
			}
		}
		//System.out.println("FOO! there are " + cards.size() + " cards in the deck");
		
		
		// deal the cards
		int p = 0;
		while( !cards.isEmpty() ) {
			
			// get a pseudorandom number from what's left in the deck
			int r = rand.nextInt( cards.size() );
			
			// assign the card to the next player
			players.get( p ).addToHand( cards.get( r ) );
			if( ++p == players.size())
				p = 0;
			
			// remove this card from the deck
			cards.remove( r );
		}
		
		// now what?
		Boolean done = false;
		int remaining = players.size();
		while( remaining > 1 ) {

			for( Player player: players ) {
				

				// find out what they want to do				
				// remove the card(s) from their hand
				
				
				// do they have anything left?
				if( player.emptyHand())
					--remaining;
			}

		}

	}

}

