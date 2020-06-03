package ex9_8;

public class Dog extends Pet {
	private String breed;
	private boolean boosterShot;
	
	public Dog(String initialName, int initialAge, double initialWeight, String breed, boolean boosterShot) {
		super(initialName, initialAge, initialWeight);
		this.breed = breed;
		this.boosterShot = boosterShot;
	}
	
	public String getBreed() {
		return breed;
	}
	public boolean isBoosterShot() {
		return boosterShot;
	}
}
