package ex6_10;

public class Temperature {
	private double degrees;
	private char scale;
	
	
	public Temperature(double degrees) {
		this.degrees = degrees;
		this.scale = 'C';
	}
	
	public Temperature(char scale) {
		this.degrees = 0.0;
		this.scale = scale;
	}
	
	public Temperature(double degrees, char scale) {
		this.degrees = degrees;
		this.scale = scale;
	}
	
	public Temperature() {
		this.degrees = 0.0;
		this.scale = 'C';
	}
	
	public double getCelsiusDegree() {
		if(scale == 'C') {
			return degrees;
		}
		else {
			return (degrees - 32) / 1.8;
		}
	}
	
	public double getFahrenheitDegree() {
		if(scale == 'F') {
			return degrees;
		}
		else {
			return (degrees * 1.8) + 32;
		}
	}
	
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}
	
	public void setScale(char scale) {
		this.scale = scale;
	}
	
	public void setTemperature(double degrees, char scale) {
		this.degrees = degrees;
		this.scale = scale;
	}
	
	public boolean equals(Temperature temp) {
		return this.getCelsiusDegree() == temp.getCelsiusDegree();
	}
	
	public boolean isGreater(Temperature temp) {
		return this.getCelsiusDegree() > temp.getCelsiusDegree();
	}
	
	public boolean isLess(Temperature temp) {
		return this.getCelsiusDegree() < temp.getCelsiusDegree();
	}
}
