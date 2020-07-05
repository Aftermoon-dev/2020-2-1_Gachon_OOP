package ex6_12;

public class ex6_12 {
	public static void main(String[] args) {
		RationalNumbers rn0 = new RationalNumbers();
		System.out.println("Value : " + rn0.getValue());
		System.out.println("String : " + rn0.toString());
		
		RationalNumbers rn = new RationalNumbers(40, 12);
		System.out.println("Value : " + rn.getValue());
		System.out.println("String : " + rn.toString());
	}
}
