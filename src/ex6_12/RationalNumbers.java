package ex6_12;

public class RationalNumbers {
	private int a;
	private int b;
	
	public RationalNumbers() {
		this.a = 0;
		this.b = 1;
	}
	
	public RationalNumbers(int numerator, int denominator) {
		this.a = numerator;
		this.b = denominator;
		simplify();
	}
	
	private void simplify() {
		int gcd = getGCD(a, b);
		this.a = a / gcd;
		this.b = b / gcd;
	}
	
	private int getGCD(int x, int y) {
		while(y > 0) {
			int t = y;
			y = x % y;
			x = t;
		}
		return x;
	}
	
	public double getValue() {
		return (double) a / b;
	}
	
	public String toString() {
		return a + "/" + b;
	}
}

