package ex2_13;

import java.util.Scanner;

public class ex2_13 {
	public static void main(String[] args) {
		double weight;
		double height;
		int age;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please type your Weight (pounds) : ");
		weight = scanner.nextDouble();
		
		System.out.print("Please type your Height (inches) : ");
		height = scanner.nextDouble();
		
		System.out.print("Please type your age : ");
		age = scanner.nextInt();
		
		scanner.close();
		
		double womanBMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
		double manBMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
		
		System.out.println("Woman needs " + womanBMR / 230.0 + " Chocloate bar(s)");
		System.out.println("Man needs " + manBMR / 230.0 + " Chocloate bar(s)");
	}
}
