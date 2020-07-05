package ex10_1c;

public class ex10_1c {
	public static void main(String[] args) {
		RegularPay rp1 = new RegularPay(10.0);
		RegularPay rp2 = new RegularPay(20.0);
		HazardPay hp1 = new HazardPay(10.0);
		HazardPay hp2 = new HazardPay(20.0);
		
		System.out.println("RegularPay1, 1 Hours : " + rp1.computePay(1));
		System.out.println("RegularPay2, 2 Hours : " + rp2.computePay(2));
		System.out.println("HazardPay1, 1 Hours : " + hp1.computePay(1));
		System.out.println("HazardPay2, 2 Hours : " + hp2.computePay(2));
	}
}
