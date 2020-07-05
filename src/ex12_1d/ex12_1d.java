package ex12_1d;

public class ex12_1d {
	public static void main(String[] args) {
		System.out.println(checkPalindrome("radar"));
		System.out.println(checkPalindrome("Straw? No, too stupid a fad, I put soot on warts."));
	}
	
	public static boolean checkPalindrome(String s) {
		if(s.length() == 1) return true;
		
		s = s.toLowerCase();
		s = s.replaceAll("[^0-9|^a-z|^A-Z]", "");
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			return checkPalindrome(s.substring(1, s.length()-1));
		}
		else return false;
	}
}
