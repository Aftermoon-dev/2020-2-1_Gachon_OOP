package ex5_12;

public class Movie {
	private String movieName;
	private String mpaaRating;
	private int[] rating = new int[5];
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMpaaRating() {
		return mpaaRating;
	}
	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
	}
	
	public void addRating(int rate) {
		if(1 <= rate && rate <= 5) {
			rating[rate-1]++;
		}
		else {
			System.out.println("Error! You can only enter rate 1~5!");
		}
	}
	
	public double getAverage() {
		int count = 0;
		double avg = 0.0;
		for(int i = 0; i < 5; i++) {
			count += rating[i];
			avg += rating[i] * (i+1);
		}
		avg /= count;
		return avg;
	}
	
	public boolean equals(Movie movie) {
		return (this.movieName.equals(movie.movieName)) 
				&& (this.mpaaRating.equals(movie.mpaaRating))
				&& (this.rating[0] == movie.rating[0]) 
				&& (this.rating[1] == movie.rating[1]) 
				&& (this.rating[2] == movie.rating[2]) 
				&& (this.rating[3] == movie.rating[3]) 
				&& (this.rating[4] == movie.rating[4]);
	}
}
