package ex7_2c;

public class Polynomial {
	private int degree;
	private double[] coefficients;
	
	public Polynomial(int max) {
		this.degree = max;
		coefficients = new double[degree+1];
	}
	
	public void setConstant(int i, int value) {
		if(degree >= i) {
			coefficients[i] = value;
		}
	}
	
	public double evaluate(int x) {
		double value = coefficients[0];
		for(int i = 1; i <= degree; i++) {
			value += coefficients[i] * Math.pow(x, i);
		}
		return value;
	}
	
}
