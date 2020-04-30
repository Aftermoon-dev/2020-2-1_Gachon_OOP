package dev.aftermoon.gachon.oop.week4.ex4_5;

public class Grade {
	private int[] grades = new int[5];
	
	public void setGradesNumber(int a, int b, int c, int d, int f) {
		if(a > 0 && b > 0 && c > 0 && d > 0 && f > 0) {
			this.grades[0] = a;
			this.grades[1] = b;
			this.grades[2] = c;
			this.grades[3] = d;
			this.grades[4] = f;
		}
		else {
			System.out.println("Number can not be negative integer! Set Canceled!");
			return;
		}
		
	}
	
	public int[] getGradesNumber() {
		int[] numbers = { grades[0], grades[1], grades[2], grades[3], grades[4] };
		return numbers;
	}
	
	public int getGradesTotalNumber() {
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total += this.grades[i];
		}
		return total;
	}
	
	public double[] getGradesPercentage() {
		double[] per = new double[5];
		
		for(int i = 0; i < 5; i++) {
			per[i] = ((double) grades[i] / (double) this.getGradesTotalNumber()) * 100.0;
		}
		
		return per;
	}
	
	public void drawBarGraph() {
		double[] per = getGradesPercentage();
		System.out.println("0   10%  20%  30%  40%  50%  60%  70%  80%  90% 100%");
		System.out.println("|    |    |    |    |    |    |    |    |    |   |");
		System.out.println("**************************************************");
		for(int i = 0; i < (int) Math.round(per[0] / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" A");
		for(int i = 0; i < (int) Math.round(per[1] / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" B");
		for(int i = 0; i < (int) Math.round(per[2] / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" C");
		for(int i = 0; i < (int) Math.round(per[3] / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" D");
		for(int i = 0; i < (int) Math.round(per[4] / 2); i++) {
			System.out.print("*");
		}
		System.out.println(" F");
	}
}
