package ex10_1b;

public class ex10_1b {
	public static void main(String[] args) {
		Shape[] shape = { new Rectangle(10, 5), new Circle(5), new RightTriangle(8, 10) };
		System.out.println(shape[0].getArea());
		System.out.println(shape[1].getArea());
		System.out.println(shape[2].getArea());
		
		System.out.println(shape[0].toString() + " / " + shape[1].toString() + " / " + shape[2].toString());
		System.out.println(shape[0].equals(shape[1]));
		System.out.println(shape[1].equals(shape[2]));
	}
}
