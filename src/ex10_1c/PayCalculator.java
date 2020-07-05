package ex10_1c;

public abstract class PayCalculator {
	double payRate;
	
	public double computePay(double hours) {
		return this.payRate * hours;
	}
}
