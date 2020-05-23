package ex5_12;

public class ex5_12 {
	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		
		movie1.setMovieName("Iron Man");
		movie1.setMpaaRating("PG-13");
		movie1.addRating(5);
		movie1.addRating(4);
		movie1.addRating(5);
		movie1.addRating(3);
		movie1.addRating(1);
		movie1.addRating(2);
		movie1.addRating(5);
		movie1.addRating(1);
		
		movie2.setMovieName("Avengers");
		movie2.setMpaaRating("PG-13");
		movie2.addRating(5);
		movie2.addRating(3);
		movie2.addRating(2);
		movie2.addRating(5);
		movie2.addRating(1);
		movie2.addRating(4);
		movie2.addRating(4);
		
		double movie1Rating = movie1.getAverage();
		double movie2Rating = movie2.getAverage();
		
		System.out.println("Movie 1\nName : " + movie1.getMovieName() + "\nMPAA Rating : " + movie1.getMpaaRating() + "\nRating : " + movie1Rating);
		System.out.println("\nMovie 2\nName : " + movie2.getMovieName() + "\nMPAA Rating : " + movie2.getMpaaRating() + "\nRating : " + movie2Rating);
		
		
		if(movie1.equals(movie2)) {
			System.out.println("Equal!");
		}
		else {
			System.out.println("Not Equal!");
		}
	}
}
