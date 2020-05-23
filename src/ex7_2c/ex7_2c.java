package ex7_2c;

public class ex7_2c {
	public static void main(String[] args) {
		Polynomial poly1 = new Polynomial(3);
		poly1.setConstant(0, 3);
		poly1.setConstant(1, 5);
		poly1.setConstant(2, 2);
		System.out.println(poly1.evaluate(3));
		
		Polynomial poly2 = new Polynomial(5);
		poly2.setConstant(0, 2);
		poly2.setConstant(1, 3);
		poly2.setConstant(2, 7);
		poly2.setConstant(3, 6);
		poly2.setConstant(4, 1);
		System.out.println(poly2.evaluate(5));
	}
}
