package ex10_1b;

public class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public String toString() {
		return "Radius : " + radius;
	}
	
	public boolean equals(Object object) {
		if(!(object != null && object instanceof Circle)) return false;
		Circle circle = (Circle) object;
		return circle.radius == this.radius;
	}
}
