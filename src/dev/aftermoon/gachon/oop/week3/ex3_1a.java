package dev.aftermoon.gachon.oop.week3;

import java.util.Scanner;

public class ex3_1a {
	public static void main(String[] args) {
		int num;
		double charge = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter check amount : ");
		num = scanner.nextInt();
		scanner.close();
		
		if(num < 10) {
			charge = 1;
		}
		else if(num < 100) {
			charge = num * 0.10;
		}
		else if(num < 1000) {
			charge = 5 + (num * 0.05);
		}
		else {
			charge = 40 + (num * 0.01);
		}
		
		System.out.println("Charge : " + charge);
	}
}
