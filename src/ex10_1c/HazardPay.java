package ex10_1c;

public class HazardPay extends PayCalculator {
	public HazardPay(double payRate) {
		this.payRate = payRate;
	}
	
	public double computePay(double hours) {
		return 1.5 * super.computePay(hours);
	}
}
