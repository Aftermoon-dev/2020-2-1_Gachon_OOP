package ex6_7;

public class ex6_7 {
	public static void main(String[] args) {
		Characteristic char1 = new Characteristic("Desc1");
		Characteristic char2 = new Characteristic("Desc1");
		Characteristic char3 = new Characteristic("Desc2");
		
		char1.setRating(10);
		char2.setRating(8);
		
		System.out.println("Set Char 3");
		char3.setRating();
		
		System.out.println(char1.getDescription() + " " + char1.getRating());
		System.out.println(char2.getDescription() + " " + char2.getRating());
		System.out.println(char3.getDescription() + " " + char3.getRating());
		
		System.out.println(char1.getCompatability(char2));	
		System.out.println(char1.getCompatability(char3));	
	}
}
