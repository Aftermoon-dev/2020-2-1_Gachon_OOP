package ex6_7;

import java.util.Scanner;

public class Characteristic {
	private String description;
	private int rating;
	
	public Characteristic(String desc) {
		this.description = desc;
		this.rating = 0;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getRating() {
		return rating;
	}
	
	private boolean isValid(int aRating) {
		return 1 <= aRating && aRating <= 10;
	}
	
	public void setRating(int aRating) {
		if(isValid(aRating)) this.rating = aRating;
	}
	
	public void setRating() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type a Rating : ");
		int aRating = scanner.nextInt();
		setRating(aRating);
		scanner.close();
	}
	
	public double getCompatability(Characteristic otherRating) {
		if(isMatch(otherRating)) {
			return getCompatibilityMeasure(otherRating);
		}
		else {
			return 0;
		}
	}
	
	private double getCompatibilityMeasure(Characteristic otherRating) {
		if(this.rating != 0 && otherRating.rating != 0) return 1 - (Math.pow(this.rating - otherRating.rating, 2.0) / 81);
		else return 0;
	}
	
	private boolean isMatch(Characteristic otherRating) {
		if(this.description.equals(otherRating.description)) 
			return true;
		else 
			return false;
	}
}
