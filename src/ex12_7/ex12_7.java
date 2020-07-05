package ex12_7;

import java.util.Scanner;

public class ex12_7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter Max Number : ");
		int num = s.nextInt();
		
		for(int i = 0; i < num; i++) {
			int c = fibonacci(i);
			System.out.print("Fibonacci #" + (i + 1) + " = " + c);
			if(!(i == 0 | i == 1)) {
				int b = fibonacci(i-1);
				double ratio = (double) c / b;
				System.out.println("; " + c + "/" + b + " = " + ratio);
			}
			else System.out.println();
		}
		
		s.close();
	}
	
	public static int fibonacci(int i) {
		if(i == 0) {
			return 0;
		}
		else if(i == 1) {
			return 1;
		}
		else {
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}
}
