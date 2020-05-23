package ex6_2a;

public class ex6_2a {
	enum Suit {
		CLUBS("black"), DIAMONDS("red"), HEARTS("red"), SPADES("black");
		
		private final String color;
	
		private Suit(String suitColor) {
			color = suitColor;
		}
		
		public String getColor() {
			return color;
		}
	}
	
	public static void main(String[] args) {
		Suit cardSuit = Suit.SPADES;
		System.out.println(cardSuit.ordinal());
		System.out.println(cardSuit.equals(Suit.CLUBS));
		System.out.println(cardSuit.compareTo(Suit.CLUBS));
		System.out.println(Suit.valueOf("CLUBS"));
		System.out.println(Suit.valueOf(cardSuit.toString()));
		System.out.println(cardSuit.getColor());
		System.out.println(cardSuit.toString());
	}
}
