
public class Card {
	public static final int ACE 	= 1;
	public static final int TWO 	= 2;
	public static final int THREE 	= 3;
	public static final int FOUR 	= 4;
	public static final int FIVE 	= 5;
	public static final int SIX 	= 6;
	public static final int SEVEN 	= 7;
	public static final int EIGHT 	= 8;
	public static final int NINE 	= 9;
	public static final int TEN 	= 10;
	public static final int JACK 	= 11;
	public static final int QUEEN 	= 12;
	public static final int KING 	= 13;
	
	public static final int HEARTS 	= 0;
	public static final int CLUBS 	= 1;
	public static final int SPADES 	= 2;
	public static final int DIAMONDS = 3;
	
	int suit;
	int value;
	
	static String[] valueStrings = {"Ace", "2", "3", "4", "5", 
			      "6", "7", "8", "9", "10", 
			      "Jack", "Queen", "King"};
	
	static String[] suitStrings = {"Hearts", "Clubs", "Diamonds", "Spades" };
	
	// constructor
	public Card( int value, int suit ) {
		this.suit = suit;
		this.value = value + 1;
	}
	
	public static String getSuitAsString( int suit ) {
		return suitStrings[ suit ];
	}
	
	public static String getValueAsString( int value ) {
		return valueStrings[ value - 1 ];
	}

	@Override
	public String toString() {
		//return "Card [suit=" + suit + ", value=" + value + "]";
		return( getValueAsString(value) + " of " + getSuitAsString(suit));
	}
	
}


