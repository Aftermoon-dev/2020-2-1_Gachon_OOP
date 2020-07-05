package ex12_1b;

public class ex12_b {
	public static void main(String[] args) {
		displayAsWords(987);
	}
	
	public static void displayAsWords(int number) {
		int length = (int) Math.log10(number) + 1;
		String[] num = new String[length];
		while(number != 0) {
			num[length-1] = getWordFromDigit(number % 10);
			number /= 10;
			length--;
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
	}
	
	public static String getWordFromDigit(int digit) {
	    String[] word = new String[] {
	        "zero", "one", "two", "three", "four",
	        "five", "six", "seven", "eight", "nine"
	    };
	    return word[digit];
	}

}
