package ex9_2b;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return height * width;
	}
	
	public String toString() {
		return "Height : " + height + ", Width : " + width;
	}
	
	public boolean equals(Object object) {
		if(!(object != null && object instanceof Rectangle)) return false;
		Rectangle t = (Rectangle) object;
		return (t.height == this.height) && (t.width == this.width);
	}
}
