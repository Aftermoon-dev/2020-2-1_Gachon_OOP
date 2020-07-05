package ex12_1c;

public class ex12_1c {
	public static void main(String[] args) {
		System.out.println(countDigits("010-1234-3456"));
	}
	
	public static int countDigits(String s) {
		if(!s.isEmpty()) {
			if(Character.isDigit(s.charAt(0))) {
				return 1 + countDigits(s.substring(1));
			}
			else return countDigits(s.substring(1));
		}
		else return 0;
	}
}
