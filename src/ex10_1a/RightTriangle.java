package ex10_1a;

public class RightTriangle extends Shape {
	private double height;
	private double width;
	
	public RightTriangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return width * height * 0.5;
	}
	
	public String toString() {
		return "Height : " + height + ", Width : " + width;
	}
	
	public boolean equals(Object object) {
		if(!(object != null && object instanceof RightTriangle)) return false;
		RightTriangle rt = (RightTriangle) object;
		return (rt.height == this.height) && (rt.width == this.width);
	}
}
