package ex9_8;

public class ex9_8 {
	public static void main(String[] args) {
		Dog d1 = new Dog("LaLa", 3, 2.8, "Pomeranian", false);
		Dog d2 = new Dog("Jake", 2, 2.7, "Chihuahua", true);
		Dog d3 = new Dog("Ari", 5, 12.4, "Welsh Corgi", true);
		Dog d4 = new Dog("Wooyoo", 4, 25.2, "Samoyed", false);
		Dog d5 = new Dog("Dudu", 9, 28.3, "Golden Retriever", true);
		
		System.out.println("Dog 1 : " + d1.getName() + "\n" + d1.getAge() + "\n" + d1.getWeight() + "\n" + d1.getBreed() + "\n" + d1.isBoosterShot() + "\n");
		
		Dog[] dogs = { d1, d2, d3, d4, d5};
		
		for(int i = 0; i < 5; i++) {
			if(dogs[i].getAge() > 2 && !dogs[i].isBoosterShot()) {
				System.out.println("Name : " + dogs[i].getName() + ", Breed : " + dogs[i].getBreed());
			}
		}
		
	}
}
