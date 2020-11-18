import java.util.ArrayList;

public class Player {
	String name;
	ArrayList<Card> cards = new ArrayList<Card>();

	
	public Player( String name ) {
		this.name = name;
	}
	
	public void addToHand( Card card ) {
		cards.add( card );
	}
	
	public void removeFromHand( Card card ) {
		cards.remove( card );
	}
	
	public boolean emptyHand() {
		return( cards.isEmpty());
	}
	public String getName() {
		return( name );
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", cards=" + cards + "]";
	}

}
 